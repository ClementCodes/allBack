package com.all.back.backPlant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.back.backPlant.model.Plant;
import com.all.back.backPlant.repository.PlantRepository;

@Service
public class PlantServiceImplementation implements PlantService {

    @Autowired
    private PlantRepository plantRepo;

    @Override
    public List<Plant> getPlant() {

        return plantRepo.findAll();
    }

    @Override
    public void save(Plant plant) {

        plantRepo.save(plant);

    }

    @Override
    public Plant findById(Integer id) {

        Optional<Plant> plantResult = plantRepo.findById(id);
        Plant plant = null;
        if (plantResult.isPresent()) {
            plant = plantResult.get();
        }
        return plant;
    }

    @Override
    public void delete(Plant plant) {

        plantRepo.delete(plant);

    }

}
