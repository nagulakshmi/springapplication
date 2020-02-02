package com.equadriga.sample.demoapp.repository;

import com.equadriga.sample.demoapp.model.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer> {


}
