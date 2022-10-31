package com.all.back.backPlant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.all.back.backPlant.model.Plant;
import com.all.back.backPlant.service.PlantService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PlantController {
    @Autowired
    private PlantService plantService;

    @GetMapping("/plants")
    public List<Plant> getUser() {
        return plantService.getPlant();
    }

    @PostMapping("/saveplant")
    public Plant saveUser(@RequestBody Plant plant) {

        plantService.save(plant);
        return plant;
    }

    @GetMapping("/plant/{id}")
    public Plant getUserById(@PathVariable Integer id) {
        Plant plant = plantService.findById(id);
        return plant;
    }

    @DeleteMapping("/deleteplant/{id}")
    public Plant deletePlant(@PathVariable Integer id) {

        Plant plant = plantService.findById(id);

        plantService.delete(plant);
        return plant;
    }

}
