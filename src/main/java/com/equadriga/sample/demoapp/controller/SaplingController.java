package com.equadriga.sample.demoapp.controller;

import com.equadriga.sample.demoapp.model.Sapling;
import com.equadriga.sample.demoapp.service.SaplingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaplingController {

    @Autowired
    private SaplingService saplingService;

    @RequestMapping(value = "/getSapling", method = RequestMethod.GET)
    @ResponseBody
    public List<Sapling> getAllSaplingCenter() {
        List<Sapling> saplingList = saplingService.getSapling();
        return saplingList;
    }


}
