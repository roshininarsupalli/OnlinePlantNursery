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
import com.capg.onlineplant.entity.Plant;
import com.capg.onlineplant.service.PlantServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest

public class PlantServiceTest {
	@InjectMocks
	private PlantServiceImpl plantService;
	
	@Mock
	private PlantDao plantRepo;
	
	@Test
	public void addPlantTest() {
		Plant plant = new Plant();
		plant.setPlantId(1);
		when(plantRepo.addPlant(plant)).thenReturn(plant);
		assertEquals(plant,plantService.addPlant(plant));
		
	}
		
}