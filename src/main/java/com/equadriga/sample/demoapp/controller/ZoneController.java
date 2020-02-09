package com.equadriga.sample.demoapp.controller;

import com.equadriga.sample.demoapp.model.Zone;
import com.equadriga.sample.demoapp.service.ZoneService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/zone")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @RequestMapping(value = "/all-zones", method = RequestMethod.GET)
    @ResponseBody
    public List<Zone> retriveAllviewZones() {
        List<Zone> zoneList = zoneService.viewAllZones();
        return zoneList;
    }

    @PostMapping
    @ApiOperation(value = "This API used to add new zone")
    @ResponseBody
    public Zone addZone(@RequestBody Zone zone) {
        return zoneService.addNewZone(zone);
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Zone getZoneById(@PathVariable int id) {
        return zoneService.getZoneById(id);
    }

    @PutMapping(value = "/{id}")
    @ResponseBody
    public Zone updateZoneById(@PathVariable int id , @RequestBody Zone zone) {
        return zoneService.updateZoneById(id,zone);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public void deleteZoneById(@PathVariable int id) {
        zoneService.deleteZoneById(id);
    }
}
