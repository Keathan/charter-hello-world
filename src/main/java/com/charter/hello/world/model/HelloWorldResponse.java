package com.charter.hello.world.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class HelloWorldResponse {
    String message;

    public HelloWorldResponse() {
        this.message = "Hello World!";
    }

    public String getMessage() {
        return message;
    }
}
