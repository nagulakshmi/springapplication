package com.equadriga.sample.demoapp.controller;

import com.equadriga.sample.demoapp.model.Zone;
import com.equadriga.sample.demoapp.service.ZoneService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/zone")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @RequestMapping(value = "/all-zones", method = RequestMethod.GET)
    @ApiOperation(value = "This API used fetch all zones")
    @ResponseBody
    public List<Zone> retriveAllviewZones() {
        return zoneService.viewAllZones();
    }

    @PostMapping
    @ApiOperation(value = "This API used to add new zone")
    @ResponseBody
    public Zone addZone(@RequestBody Zone zone) {
        return zoneService.addNewZone(zone);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "This API used to add zone for the given id")
    @ResponseBody
    public Optional<Zone> getZoneById(@ApiParam(value = "zone id") @PathVariable int id) {
        return zoneService.getZoneById(id);
    }

    @PutMapping(value = "/{id}")
    @ApiOperation(value = "This API used to updated the zone for the given iod")
    @ResponseBody
    public Zone updateZoneById(@ApiParam(value = "zone id") @PathVariable int id ,
                               @ApiParam(value = "zone object") @RequestBody Zone zone) {
        return zoneService.updateZoneById(id,zone);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "This API used to delete the zone for the given id")
    @ResponseBody
    public void deleteZoneById(@PathVariable int id) {
        zoneService.deleteZoneById(id);
    }
}
