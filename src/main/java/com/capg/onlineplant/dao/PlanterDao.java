package com.capg.onlineplant.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.onlineplant.entity.Planter;

@Repository
public interface PlanterDao {
	List<Planter> viewAllPlanters();
    Planter viewPlanter(String planterShape);
	Planter viewPlanter(int planterId);
	Planter addPlanter(Planter planter);
	Planter updatePlanter(Planter planter);
	Planter removePlanter(Planter planter);
}