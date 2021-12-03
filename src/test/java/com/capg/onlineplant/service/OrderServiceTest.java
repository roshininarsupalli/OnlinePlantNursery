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

import com.capg.onlineplant.dao.CartDao;
import com.capg.onlineplant.dao.OrderDao;
import com.capg.onlineplant.entity.Cart;
import com.capg.onlineplant.entity.Order;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {
	@InjectMocks
    private OrderServiceImpl orderService;
	@Mock
	private OrderDao orderRepo;
	
	@Test
	public void addOrderTest() {
		Order order = new Order();
		order.setBookingOrderId(1);
		when(orderRepo.addOrder(order)).thenReturn(order);
		assertEquals(order, orderService.addOrder(order));
	}
	
}	

