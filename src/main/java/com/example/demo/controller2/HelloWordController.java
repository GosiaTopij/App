package com.example.demo.controller2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @RequestMapping(value="/")
    public String hello(){
        return "Hello World :) !!";
    }
}
