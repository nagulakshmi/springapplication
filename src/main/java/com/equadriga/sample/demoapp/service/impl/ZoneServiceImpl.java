package com.equadriga.sample.demoapp.service.impl;

import com.equadriga.sample.demoapp.model.Zone;
import com.equadriga.sample.demoapp.repository.ZoneRepository;
import com.equadriga.sample.demoapp.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ZoneServiceImpl implements ZoneService {

    @Autowired
    private ZoneRepository zoneRepository;

    @Override
    public List<Zone> viewAllZones() {
        return zoneRepository.findAll();
    }

    @Override
    public Zone addNewZone(Zone zone) {
        return zoneRepository.save(zone);
    }
}



