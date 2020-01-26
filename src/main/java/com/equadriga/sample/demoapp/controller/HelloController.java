package com.equadriga.sample.demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    public String HelloWorld(){
        return "HelloWorld";
    }

}
