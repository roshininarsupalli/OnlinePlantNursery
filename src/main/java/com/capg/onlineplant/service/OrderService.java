package com.capg.onlineplant.service;


	import java.util.List;
	import org.springframework.stereotype.Service;
	import com.capg.onlineplant.entity.Order;
	@Service
	public interface OrderService {
		List<Order> viewAllOrders();
		Order viewOrder(int orderId);
		Order addOrder(Order order);
		Order updateOrder(Order order);
		Order deleteOrder(int orderId);
	}
