package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
