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
import com.capg.onlineplant.entity.Cart;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartServiceTest {
	@InjectMocks
    private CartServiceImpl Serv;
	@Mock
	private CartDao deo;
	
	@Test
	public void addCartTest() {
		Cart cart = new Cart();
		cart.setCartId(1);
		when(deo.addCart(cart)).thenReturn(cart);
		assertEquals(cart, Serv.addCart(cart));
	}
	
}	
