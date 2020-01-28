package com.equadriga.sample.demoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    public String HelloWorld(){
        return "HelloWorld";
    }

}
