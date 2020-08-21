package com.jalasoft.project.controller.endpoint;

import com.jalasoft.project.common.exception.InvalidDataException;
import com.jalasoft.project.controller.component.CustomerProperties;
import com.jalasoft.project.controller.exception.FileException;
import com.jalasoft.project.controller.request.RequestCompanyParam;
import com.jalasoft.project.controller.service.FileService;
import com.jalasoft.project.model.builder.CompanyBuilder;
import com.jalasoft.project.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jalasoft.project.controller.response.ErrorResponse;
import com.jalasoft.project.controller.response.OKResponse;
import com.jalasoft.project.controller.response.Response;

import javax.servlet.http.HttpServletResponse;
import java.io.File;

@RestController
@RequestMapping("/api/v1")
public class RegisterCompany {

    @Autowired
    private CustomerProperties customerProperties;

    @Autowired
    private FileService fileService;

    @PostMapping("/register-company-account")
    public ResponseEntity<Response> registerCompany(RequestCompanyParam companyParam) {
        try {
            companyParam.validate();
            Customer company = new CompanyBuilder(companyParam.getId(), companyParam.getDescription())
                    .withName(companyParam.getCompanyName())
                    .withPhone(companyParam.getCompanyPhone())
                    .withContact(companyParam.getFirstName(), companyParam.getLastName())
                    .withDetails(companyParam.getCity(), companyParam.getPostalCode())
                    .build();
            System.out.println(company.show());
            String resultMessage = company.save();
            File customerFile = this.fileService.store(companyParam.getFile(), this.customerProperties.getFilesFolder());

            return ResponseEntity.ok().body(
                    new OKResponse<Integer>(HttpServletResponse.SC_OK, resultMessage)
            );
        } catch (InvalidDataException | FileException ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse<Integer>(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage())
            );
        }
    }

}


