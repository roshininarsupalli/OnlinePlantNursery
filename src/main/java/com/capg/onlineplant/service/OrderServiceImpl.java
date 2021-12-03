package com.capg.onlineplant.service;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import com.capg.onlineplant.dao.OrderDao;
import com.capg.onlineplant.entity.Order;

	@Transactional
	@Service
	public class OrderServiceImpl implements OrderService{
		
		@Autowired
		private OrderDao orderRepo;

		@Override
		public List<Order> viewAllOrders() {
			return orderRepo.viewAllOrders();
		}
			
		@Override
		public Order viewOrder(int orderId) {
			return orderRepo.viewOrder(orderId);
		}

		@Override
		public Order addOrder(Order order) {
			Order addorder = new Order();
			addorder.setOrderDate(order.getOrderDate());
			addorder.setPrice(order.getPrice());
			addorder.setQuantity(order.getQuantity());
			addorder.setTransactionMode(order.getTransactionMode());
			return orderRepo.addOrder(order);
		}

		@Override
		public Order updateOrder(Order order) {
				return orderRepo.updateOrder(order);

			}

		@Override
		public Order deleteOrder(int orderId) {
			return orderRepo.deleteOrder(orderId);
		}

	}
