package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldHandler {
    @RequestMapping(value = "/index")
    public String index(){
        return "Hello World !";
    }
}
