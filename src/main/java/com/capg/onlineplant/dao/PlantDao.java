package com.capg.onlineplant.dao;
import java.util.List;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.capg.onlineplant.entity.Plant;

@Repository
public interface PlantDao  {
    List<Plant> viewAllPlants();
    Plant viewPlant(String commonName);
	Plant findBycommonName(String commonName);
	List<Plant> findBytypeOfPlant(String typeOfPlant);
	Plant addPlant(Plant plant);
	Plant updatePlant(Plant plant);
	Plant removePlant(Plant plant);
	
}
