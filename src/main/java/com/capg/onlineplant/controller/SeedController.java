package com.capg.onlineplant.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capg.onlineplant.entity.Seed;
import com.capg.onlineplant.exception.SeedIdNotFoundException;
import com.capg.onlineplant.service.SeedService;


@RestController
@RequestMapping(value = "seeds")
@CrossOrigin("http://localhost:4200")
public class SeedController {	

	@Autowired
    SeedService seedService;

	@PostMapping(path="/addSeed")
	public ResponseEntity<Seed> addSeed(@RequestBody Seed seed) {
		seedService.addSeed(seed);
		return new ResponseEntity<Seed>(seed, HttpStatus.CREATED);
	}
	
	@PutMapping({"/updateSeed"})
	public ResponseEntity<Seed> updateSeed(@RequestBody Seed seed) {
		seedService.updateSeed(seed);
		return new ResponseEntity<Seed>(seed, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/removeSeed")
	public ResponseEntity<Seed> removeSeed(@PathVariable Seed seed) throws SeedIdNotFoundException{
		//logger.trace("deleting the whole plant");	
		return new ResponseEntity<Seed>(seedService.removeSeed(seed), HttpStatus.OK);
	}
	@GetMapping(path="/addseeds")
	public ResponseEntity<List<Seed>> viewAllSeeds() {
		//logger.trace("fetching all the plants");
		List<Seed> list = seedService.viewAllSeeds();
		return new ResponseEntity<List<Seed>>(list, HttpStatus.OK);
	}

	@GetMapping(path="/addseeds/typeOfSeeds/{typeOfSeed}")
	public ResponseEntity<List<Seed>> viewAllSeeds(@PathVariable String typeOfSeed) {
		//logger.trace("searching the plants of type "+typeOfPlant);
		List<Seed>list= seedService.viewAllSeeds();
		return new ResponseEntity<List<Seed>>(list,HttpStatus.OK);
	}
	
	@GetMapping(path="/addseeds/{seedId}")
	public ResponseEntity<Seed> viewSeed(@PathVariable("seedId") int seedId) {
		seedService.viewSeed(seedId);
		return new ResponseEntity<Seed>(HttpStatus.OK);
	}
	@GetMapping(path="/addseeds/commonName/{commonName}")
	public ResponseEntity<Seed> findBycommonName(@PathVariable("commonName") String commonName) {
		Optional<Seed> se = seedService.findBycommonName(commonName);
		if (se == null) {
			throw new SeedIdNotFoundException("seed not found for name=" + commonName);
		}
		return new ResponseEntity<Seed>(new HttpHeaders(), HttpStatus.OK);
	}

}