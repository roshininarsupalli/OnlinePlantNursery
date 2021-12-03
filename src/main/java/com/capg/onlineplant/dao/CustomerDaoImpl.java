package com.capg.onlineplant.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.capg.onlineplant.entity.Customer;

@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
			@PersistenceContext
		    private EntityManager entityManager;
			
			@Override
			public List<Customer> viewAllCustomers() {
				Query q = entityManager.createQuery("select e from Customer e");
			    List<Customer> list=q.getResultList();
				return list;
			}

			@Override
			public Customer viewCustomer(int customerId) {
				Customer customer=entityManager.find(Customer.class,customerId);  
		          return customer ;
			}
			@Override
			public Customer validateCustomer(String username,String password) {
//				Customer customer=entityManager.find(Customer.class,username);
//				if(password==customer.getPassword())
//				{	
//				return customer;
//			}
//				return null;
				Query q = entityManager.createQuery("select e from Customer e where e.username=:customerId");
				  q.setParameter("customerId",username);
				  Customer customer=(Customer) q.getSingleResult();
				  System.out.println(customer.toString());
				if(customer!=null)
				{
					if(password==customer.getPassword())
					{
						return customer;
				}
					
			}
				return null;
				}
			
					@Override
			public Customer addCustomer(Customer customer) {
				return entityManager.merge(customer);
			
			}

			@Override
			public Customer updateCustomer(Customer customer) {
				return entityManager.merge(customer);
			}

			@Override
			public Customer removeCustomer(Customer customer) {
				Customer pt=entityManager.find(Customer.class, customer);
				 entityManager.remove(customer);
				return pt;
			}

		 }
