package com.all.back.backPlant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.all.back.backPlant.model.Plant;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Integer> {

}
