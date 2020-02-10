package com.equadriga.sample.demoapp.service;

import com.equadriga.sample.demoapp.model.Zone;

import java.util.List;
import java.util.Optional;

public interface ZoneService {

    List<Zone> viewAllZones();

    Zone addNewZone(Zone zone);

    Optional<Zone> getZoneById(int id);

    Zone updateZoneById(int id , Zone zone);

    void deleteZoneById(int id);
}
