package com.all.back.backPlant.service;

import java.util.List;

import com.all.back.backPlant.model.Plant;

public interface PlantService {

    public List<Plant> getPlant();

    public void save(Plant plant);

    public Plant findById(Integer id);

    public void delete(Plant plant);
}
