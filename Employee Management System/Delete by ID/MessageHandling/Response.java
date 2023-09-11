package com.zaio.MessageHandling;

import org.springframework.stereotype.Component;

@Component
public class Response {
    public String response;

    public Response() {
    }

    public Response(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
