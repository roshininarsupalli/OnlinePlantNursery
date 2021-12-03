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

import com.capg.onlineplant.entity.Planter;
import com.capg.onlineplant.exception.PlanterIdNotFoundException;
import com.capg.onlineplant.service.PlanterService;

@RestController
@RequestMapping(value = "planters")
@CrossOrigin("http://localhost:4200")
public class PlanterController {	

	@Autowired
    PlanterService planterService;

	@PostMapping(path="/addplanter")
	public ResponseEntity<Planter> addPlanter(@RequestBody Planter planter) {
		planterService.addPlanter(planter);
		return new ResponseEntity<Planter>(planter, HttpStatus.CREATED);
	}
	
	@PutMapping({"/updateplanter"})
	public ResponseEntity<Planter> updatePlanter(@RequestBody Planter planter, @PathVariable int planterId) {
		// logger.trace("updating the whole plant having id "+ id);  
		planterService.updatePlanter(planter);
		return new ResponseEntity<Planter>(planter, HttpStatus.ACCEPTED);
	}

	//@PutMapping("/admin/plant/{commonName}")
	//public ResponseEntity<Plant> addPlant(@PathVariable Plant plant){
		//logger.trace("adding "+stock+" plants to the stock");
		//return new ResponseEntity<Plant>(plantService.addPlant(), HttpStatus.ACCEPTED);
	//}
	
	@DeleteMapping("/removeplanter")
	public ResponseEntity<Planter> removePlanter(@PathVariable Planter planterId) throws PlanterIdNotFoundException{
		//logger.trace("deleting the whole plant");	
		return new ResponseEntity<Planter>(planterService.removePlanter(planterId), HttpStatus.OK);
	}

	//@GetMapping({"/admin/plant/plantId/{plantId}", "/customers/plant/plantId/{plantId}"})
	//public ResponseEntity<Plant> viewPlant(@PathVariable Integer plantId) {
		//logger.trace("fetching the plant with id "+ id);
		//return new ResponseEntity<Plant>(plantService.viewPlant(plantId), HttpStatus.OK);
	//}

	@GetMapping(path="/addplanters")
	public ResponseEntity<List<Planter>> viewAllPlanters() {
		//logger.trace("fetching all the plants");
		List<Planter> list = planterService.viewAllPlanters();
		return new ResponseEntity<List<Planter>>(list, HttpStatus.OK);
	}

	@GetMapping(path="/addplanters/planterShape/{planterShape}")
	public ResponseEntity<List<Planter>> viewAllPlanters(@PathVariable String planterShape) {
		//logger.trace("searching the plants of type "+typeOfPlant);
		List<Planter> list = planterService.viewAllPlanters();
		return new ResponseEntity<List<Planter>>(list,HttpStatus.OK);
	}
}
