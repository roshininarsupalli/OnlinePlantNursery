package com.capg.onlineplant.dao;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.capg.onlineplant.entity.Seed;
@Transactional
@Repository
public interface SeedDao  {
	Optional<Seed> findBycommonName(String commonName);
	List<Seed> viewAllSeeds();
	List<Seed> findBytypeOfSeed(String typeOfSeed);
	Seed addSeed(Seed seed);
	Seed removeSeed(Seed seed);
	Seed updateSeed(Seed seed);
	Seed viewSeed(int seedId);	
}
