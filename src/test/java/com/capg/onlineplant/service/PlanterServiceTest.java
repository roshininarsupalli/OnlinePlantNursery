package com.capg.onlineplant.service;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.onlineplant.dao.PlanterDao;
import com.capg.onlineplant.entity.Planter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlanterServiceTest {
	@InjectMocks
    private PlanterServiceImpl planterService;
	@Mock
	private PlanterDao planterRepo;
	
	@Test
	public void addPlanterTest() {
		Planter planter = new Planter();
		planter.setPlanterId(2);
		when(planterRepo.addPlanter(planter)).thenReturn(planter);
		assertEquals(planter, planterService.addPlanter(planter));
	}
	
}	

