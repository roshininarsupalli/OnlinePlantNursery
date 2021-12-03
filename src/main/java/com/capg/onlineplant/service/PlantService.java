package com.capg.onlineplant.service;

import java.util.List;


import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.capg.onlineplant.entity.Plant;
@Service
public interface PlantService {
	    List<Plant> viewAllPlants();
	    Plant viewPlant(String commonName);
		Plant findBycommonName(String commonName);
		List<Plant> findBytypeOfPlant(String typeOfPlant);
		Plant addPlant(Plant plant);
		Plant updatePlant(Plant plant);
		Plant removePlant(Plant plant);
}
