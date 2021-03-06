package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "HelloWorldHandler")
public class HelloWorldHandler {
    @RequestMapping(value = "/index")
    public String index(){
        return "Hello World !";
    }

    //获取application.properties配置的值
    @Value("${shyy.msg}")
    private String msg;

    @RequestMapping(value = "/showMsg")
    public String showMsg() {
        return this.msg;
    }
}
