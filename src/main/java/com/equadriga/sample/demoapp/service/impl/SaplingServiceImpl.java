package com.equadriga.sample.demoapp.service.impl;

import com.equadriga.sample.demoapp.model.Sapling;
import com.equadriga.sample.demoapp.repository.SaplingRepository;
import com.equadriga.sample.demoapp.service.SaplingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaplingServiceImpl  implements SaplingService {

    @Autowired
    private SaplingRepository  saplingRepository;

    @Override
    public List<Sapling> getSapling() {
        return saplingRepository.findAll();
    }
}
