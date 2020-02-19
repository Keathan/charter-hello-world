package com.charter.hello.world.web;

import com.charter.hello.world.model.HelloWorldResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/hello")
public class WebController {

    HelloWorldResponse helloWorldResponse;

    @Autowired
    WebController(HelloWorldResponse helloWorldResponse) {
        this.helloWorldResponse = helloWorldResponse;
    }

    @GetMapping(consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseBody HelloWorldResponse hello() {
        return helloWorldResponse;
    }

    @PostMapping(consumes = {"application/json"},
            produces = {"application/json"})
    void hello(@RequestBody HelloWorldResponse helloWorldResponse) {
        this.helloWorldResponse = helloWorldResponse;
    }
}
