package com.jalasoft.project.controller.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "execute.customer")
public class CustomerProperties {
    private String filesFolder;

    public String getFilesFolder() {
        return filesFolder;
    }

    public void setFilesFolder(String filesFolder) {
        this.filesFolder = filesFolder;
    }

}
