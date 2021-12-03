package com.capg.onlineplant.dao;


import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.capg.onlineplant.entity.Order;


@Repository
@Transactional

public  class OrderDaoImpl implements OrderDao
 {
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<Order> viewAllOrders() {
		Query o = entityManager.createQuery("select o from Orders o");
	    List<Order> list=o.getResultList();
		return list;
	}

	@Override
	public Order viewOrder(int orderId) {
		Order order=entityManager.find(Order.class,orderId);  
          return order ;
	}

	@Override
	public Order addOrder(Order order) {
		return entityManager.merge(order);
	}

	@Override
	public Order updateOrder(Order order) {
		return entityManager.merge(order);
	}

	@Override
	public Order deleteOrder(int orderId) {
		Order order=entityManager.find(Order.class,orderId);  
        return order; 
	}
 }