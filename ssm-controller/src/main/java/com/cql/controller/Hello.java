package com.cql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello ssm!";
    }

}