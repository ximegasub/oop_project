package com.jalasoft.project.controller.endpoint;

import com.jalasoft.project.controller.response.OKResponse;
import com.jalasoft.project.controller.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1")
public class Hello {

    @GetMapping("/hello")
    public ResponseEntity<Response>  sayHello() {
        //return "Hello Xime!!!!!";
        String resultMessage = "Hello Xime!!!!!";
        return ResponseEntity.ok().body(
                new OKResponse<Integer>(HttpServletResponse.SC_OK, resultMessage)
        );
    }
}

