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
import com.capg.onlineplant.dao.CustomerDao;
import com.capg.onlineplant.entity.Customer;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
	@InjectMocks
    private CustomerServiceImpl customerService;
	@Mock
	private CustomerDao dao;
	
	@Test
	public void addCustomerTest() {
		Customer customer = new Customer();
		customer.setCustomerId(1);
		when(dao.addCustomer(customer)).thenReturn(customer);
		assertEquals(customer, customerService.addCustomer(customer));
	}
	
}	
