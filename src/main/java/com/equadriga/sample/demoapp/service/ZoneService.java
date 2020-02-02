package com.equadriga.sample.demoapp.service;

import com.equadriga.sample.demoapp.model.Zone;

import java.util.List;

public interface ZoneService {

    List<Zone> viewAllZones();

    Zone addNewZone(Zone zone);


}
