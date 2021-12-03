package com.capg.onlineplant.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.onlineplant.dao.SeedDao;
import com.capg.onlineplant.entity.Seed;
@Transactional
@Service
public class SeedServiceImpl implements SeedService {
	@Autowired
	private SeedDao seedRepo;

	@Override
	public Optional<Seed> findBycommonName(String commonName) {
		return seedRepo.findBycommonName(commonName);
	}

	@Override
	public List<Seed> viewAllSeeds() {
		return seedRepo.viewAllSeeds();
		
	}

	@Override
	public List<Seed> findBytypeOfSeed(String typeOfSeed) {
		return seedRepo.findBytypeOfSeed(typeOfSeed);
	}

	@Override
	public Seed addSeed(Seed seed) {
		Seed addseed = new Seed();
		addseed.setBloomTime(seed.getBloomTime());
		addseed.setCommonName(seed.getCommonName());
		addseed.setSeedsCost(seed.getSeedsCost());
		addseed.setSeedsDescription(seed.getSeedsDescription());
		addseed.setDifficultyLevel(seed.getDifficultyLevel());
		
		addseed.setSeedsPerPacket(seed.getSeedsPerPacket());
		addseed.setWatering(seed.getWatering());
		addseed.setSeedsStock(seed.getSeedsStock());
		addseed.setTemperature(seed.getTemperature());
		addseed.setTypeOfSeeds(seed.getTypeOfSeeds());
		return seedRepo.addSeed(seed);
	}
	@Override
	public Seed removeSeed(Seed seed) {
		return seedRepo.removeSeed(seed);
	}
	@Override
	public Seed updateSeed(Seed seed) {
		return seedRepo.updateSeed(seed);
	}
	@Override
	public Seed viewSeed(int seedId) {
		return seedRepo.viewSeed(seedId);
	}

}
