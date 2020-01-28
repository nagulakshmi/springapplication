package com.equadriga.sample.demoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZoneController {
    @RequestMapping(value = "/zone",method = RequestMethod.GET)
    public String Zone(){
        return "zone name";

    }

}
