package com.capg.onlineplant.dao;


import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.capg.onlineplant.entity.Planter;

@Repository
@Transactional

public  class PlanterDaoImpl implements PlanterDao
 {
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<Planter> viewAllPlanters() {
		Query u = entityManager.createQuery("select p from Planters p");
	    List<Planter> list=u.getResultList();
		return list;
	}

	@Override
	public Planter viewPlanter(String planterShape) {
		Planter planter=entityManager.find(Planter.class,planterShape);  
          return planter;
	}

	@Override
	public Planter viewPlanter(int planterId) {
		Planter planter=entityManager.find(Planter.class,planterId);  
          return planter;
	}

	@Override
	public Planter addPlanter(Planter planter) {
		return entityManager.merge(planter);
	}

	public Planter updatePlanter(Planter planter) {
		return entityManager.merge(planter);
	}

	@Override
	public Planter removePlanter(Planter planter) {
     Planter ptr=entityManager.find(Planter.class, planter);
	 entityManager.remove(planter);
	 return ptr;

	}
 }