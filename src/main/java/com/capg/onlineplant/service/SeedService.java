package com.capg.onlineplant.service;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.capg.onlineplant.entity.Seed;

@Service
public interface SeedService {
	Optional<Seed> findBycommonName(String commonName);
	List<Seed> viewAllSeeds();
	List<Seed> findBytypeOfSeed(String typeOfSeed);
	Seed addSeed(Seed seed);
	Seed removeSeed(Seed seed);
	Seed updateSeed(Seed seed);
	Seed viewSeed(int seedId);		
}