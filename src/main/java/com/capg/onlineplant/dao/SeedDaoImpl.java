package com.capg.onlineplant.dao;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.capg.onlineplant.entity.Seed;
@Repository
public class SeedDaoImpl implements SeedDao
	 {
		@PersistenceContext
	    private EntityManager entityManager;

		@Override
		public List<Seed> viewAllSeeds() {
			Query q = entityManager.createQuery("select e from Seeds e");
		    List<Seed> list=q.getResultList();
			return list;
		}

		@Override
		public Seed viewSeed(int seedId) {
			Seed seed=entityManager.find(Seed.class,seedId);  
	          return seed ;
		}

		@Override
		public Optional<Seed> findBycommonName(String commonName) {
			Optional<Seed> seed=Optional.empty();  
	          return seed ;
		}

		@Override
		public List<Seed> findBytypeOfSeed(String typeOfSeed) {
			Query q = entityManager.createQuery("select e from Seeds e");
		    List<Seed> list=q.getResultList();
			return list;
		}

		@Override
		public Seed addSeed(Seed seed) {
			return entityManager.merge(seed);
		}
		@Override
		public Seed updateSeed(Seed seed) {
			return entityManager.merge(seed);
		}		
		@Override
		public Seed removeSeed(Seed seed) {
			Seed st=entityManager.find(Seed.class, seed);
			 entityManager.remove(seed);
			return st;
		}

	 }