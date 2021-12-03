package com.capg.onlineplant.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.onlineplant.dao.PlantDao;
import com.capg.onlineplant.entity.Plant;
@Transactional
@Service
public class PlantServiceImpl implements PlantService{
	
	@Autowired
	private PlantDao plantRepo;

	@Override
	public List<Plant> findBytypeOfPlant(String typeOfPlant) {
		return plantRepo.findBytypeOfPlant(typeOfPlant);
	
	}

	@Override
	public List<Plant> viewAllPlants() {
		return plantRepo.viewAllPlants();
	}

//	@Override
//	public Optional<Plant> viewPlant(String commonName) {
//		return plantRepo.findByName();}
		
	@Override
	public Plant findBycommonName(String commonName) {
		return plantRepo.findBycommonName(commonName);
	}

	@Override
	public Plant addPlant(Plant plant) {
		Plant addplant = new Plant();
		addplant.setBloomTime(plant.getBloomTime());
		addplant.setCommonName(plant.getCommonName());
		addplant.setPlantCost(plant.getPlantCost());
		addplant.setPlantDescription(plant.getPlantDescription());
		addplant.setDifficultyLevel(plant.getDifficultyLevel());
		addplant.setPlantHeight(plant.getPlantHeight());
		addplant.setMedicinalOrCulinaryUse(plant.getMedicinalOrCulinaryUse());
		addplant.setPlantSpread(plant.getPlantSpread());
		addplant.setPlantStock(plant.getPlantStock());
		addplant.setTemperature(plant.getTemperature());
		addplant.setTypeOfPlant(plant.getTypeOfPlant());
		return plantRepo.addPlant(plant);
	}

	@Override
	public Plant updatePlant(Plant plant) {
			return plantRepo.updatePlant(plant);

		}

	@Override
	public Plant removePlant(Plant plant) {
		return plantRepo.removePlant(plant);
	}

	@Override
	public Plant viewPlant(String commonName) {
		return plantRepo.viewPlant(commonName);
	}

	}



		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

	