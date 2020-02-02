package com.equadriga.sample.demoapp.controller;

import com.equadriga.sample.demoapp.model.Zone;
import com.equadriga.sample.demoapp.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @RequestMapping(value = "/allZone", method = RequestMethod.GET)
    @ResponseBody
    public List<Zone> retriveAllviewZones() {

        List<Zone> zoneList = zoneService.viewAllZones();
        return zoneList;
    }

}
