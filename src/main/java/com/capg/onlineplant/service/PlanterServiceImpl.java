package com.capg.onlineplant.service;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import com.capg.onlineplant.dao.PlanterDao;
import com.capg.onlineplant.entity.Planter;

	@Transactional
	@Service
	public class PlanterServiceImpl implements PlanterService{
		
		@Autowired
		private PlanterDao planterRepo;

		@Override
		public List<Planter> viewAllPlanters() {
			return planterRepo.viewAllPlanters();
		}
			
		@Override
		public Planter viewPlanter(int planterId) {
			return planterRepo.viewPlanter(planterId);
		}

		@Override
		public Planter addPlanter(Planter planter) {
			Planter addplanter = new Planter();
			addplanter.setPlanterheight(planter.getPlanterheight());
			addplanter.setPlanterCapacity(planter.getPlanterCapacity());
			addplanter.setPlanterCost(planter.getPlanterCost());
			addplanter.setPlanterColor(planter.getPlanterColor());
			addplanter.setDrinageHoles(planter.getDrinageHoles());
			addplanter.setPlanterShape(planter.getPlanterShape());
			addplanter.setPlanterStock(planter.getPlanterStock());
			return planterRepo.addPlanter(planter);
		}

		@Override
		public Planter updatePlanter(Planter planter) {
				return planterRepo.updatePlanter(planter);

			}

		@Override
		public Planter removePlanter(Planter planter) {
			return planterRepo.removePlanter(planter);
		}

		@Override
		public Planter viewPlanter(String planterShape) {
			return planterRepo.viewPlanter(planterShape);
		}
	}
