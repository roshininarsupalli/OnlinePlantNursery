package com.capg.onlineplant.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.capg.onlineplant.entity.Plant;

	@Repository
	@Transactional

public  class PlantDaoImpl implements PlantDao
	 {
		@PersistenceContext
	    private EntityManager entityManager;

		@Override
		public List<Plant> viewAllPlants() {
			Query q = entityManager.createQuery("select e from Plants e");
		    List<Plant> list=q.getResultList();
			return list;
		}

		@Override
		public Plant viewPlant(String commonName) {
			Plant plant=entityManager.find(Plant.class,commonName);  
	          return plant ;
		}

		@Override
		public Plant findBycommonName(String commonName) {
			Plant plant=entityManager.find(Plant.class,commonName);  
	          return plant ;
		}

		@Override
		public List<Plant> findBytypeOfPlant(String typeOfPlant) {
			Query q = entityManager.createQuery("select e from Plants e");
		    List<Plant> list=q.getResultList();
			return list;
		}

		@Override
		public Plant addPlant(Plant plant) {
			return entityManager.merge(plant);
		}

		@Override
		public Plant updatePlant(Plant plant) {
			return entityManager.merge(plant);
		}

		@Override
		public Plant removePlant(Plant plant) {
			Plant pt=entityManager.find(Plant.class, plant);
			 entityManager.remove(plant);
			return pt;

		}

	 }