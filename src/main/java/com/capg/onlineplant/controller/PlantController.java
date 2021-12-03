package com.capg.onlineplant.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.onlineplant.entity.Plant;
import com.capg.onlineplant.exception.PlantIdNotFoundException;
import com.capg.onlineplant.service.PlantService;

@RestController
@RequestMapping(value = "plants")
@CrossOrigin("http://localhost:4200")
public class PlantController {	

	@Autowired
    PlantService plantService;

	@PostMapping(path="/addplant")
	public ResponseEntity<Plant> addPlant(@RequestBody Plant plant) {
		plantService.addPlant(plant);
		return new ResponseEntity<Plant>(plant, HttpStatus.CREATED);
	}
	
	@PutMapping({"/updateplant"})
	public ResponseEntity<Plant> updatePlant(@RequestBody Plant plant, @PathVariable int plantId) {
		// logger.trace("updating the whole plant having id "+ id);  
		plantService.updatePlant(plant);
		return new ResponseEntity<Plant>(plant, HttpStatus.ACCEPTED);
	}

	//@PutMapping("/admin/plant/{commonName}")
	//public ResponseEntity<Plant> addPlant(@PathVariable Plant plant){
		//logger.trace("adding "+stock+" plants to the stock");
		//return new ResponseEntity<Plant>(plantService.addPlant(), HttpStatus.ACCEPTED);
	//}
	
	@DeleteMapping("/removeplant")
	public ResponseEntity<Plant> removePlant(@PathVariable Plant plantId) throws PlantIdNotFoundException{
		//logger.trace("deleting the whole plant");	
		return new ResponseEntity<Plant>(plantService.removePlant(plantId), HttpStatus.OK);
	}

	//@GetMapping({"/admin/plant/plantId/{plantId}", "/customers/plant/plantId/{plantId}"})
	//public ResponseEntity<Plant> viewPlant(@PathVariable Integer plantId) {
		//logger.trace("fetching the plant with id "+ id);
		//return new ResponseEntity<Plant>(plantService.viewPlant(plantId), HttpStatus.OK);
	//}

	@GetMapping(path="/addplants")
	public ResponseEntity<List<Plant>> viewAllPlants() {
		//logger.trace("fetching all the plants");
		List<Plant> list = plantService.viewAllPlants();
		return new ResponseEntity<List<Plant>>(list, HttpStatus.OK);
	}

	@GetMapping(path="/addplants/typeOfPlant/{typeOfPlant}")
	public ResponseEntity<List<Plant>> viewAllPlants(@PathVariable String typeOfPlant) {
		//logger.trace("searching the plants of type "+typeOfPlant);
		List<Plant> list = plantService.viewAllPlants();
		return new ResponseEntity<List<Plant>>(list,HttpStatus.OK);
	}

}
