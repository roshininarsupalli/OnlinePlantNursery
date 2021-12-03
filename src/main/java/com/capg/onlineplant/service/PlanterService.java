package com.capg.onlineplant.service;

	import java.util.List;
	import org.springframework.stereotype.Service;
	import com.capg.onlineplant.entity.Planter;
	@Service
	public interface PlanterService {
		List<Planter> viewAllPlanters();
	    Planter viewPlanter(String planterShape);
		Planter viewPlanter(int planterId);
		Planter addPlanter(Planter planter);
		Planter updatePlanter(Planter planter);
		Planter removePlanter(Planter planter);
	}
