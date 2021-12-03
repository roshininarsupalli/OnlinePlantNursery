package com.capg.onlineplant.service;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.onlineplant.dao.PlantDao;
import com.capg.onlineplant.dao.SeedDao;
import com.capg.onlineplant.entity.Plant;
import com.capg.onlineplant.entity.Seed;
import com.capg.onlineplant.service.PlantServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest

public class SeedServiceTest {
	@InjectMocks
	private SeedServiceImpl seedService;
	
	@Mock
	private SeedDao seedRepo;
	
	@Test
	public void addSeedTest() {
		Seed seed = new Seed();
		seed.setSeedId(1);
		when(seedRepo.addSeed(seed)).thenReturn(seed);
		assertEquals(seed,seedService.addSeed(seed));
	
	}
		
}
