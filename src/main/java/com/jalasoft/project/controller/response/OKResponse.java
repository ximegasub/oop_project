package com.jalasoft.project.controller.response;

/**
 * @author HP
 * @version 1.1
 */
public class OKResponse<T> extends Response {
    private String message;

    public OKResponse(T status, String message) {
        super(status);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
