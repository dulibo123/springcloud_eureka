package com.org.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/hello")
    public String Hello(String name){
        return "Hello: "+name;
    }
}
