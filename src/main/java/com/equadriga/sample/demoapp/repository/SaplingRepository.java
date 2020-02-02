package com.equadriga.sample.demoapp.repository;

import com.equadriga.sample.demoapp.model.Sapling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaplingRepository extends JpaRepository<Sapling, Integer> {

}
