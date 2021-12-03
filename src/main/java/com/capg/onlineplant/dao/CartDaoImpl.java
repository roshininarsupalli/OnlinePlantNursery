package com.capg.onlineplant.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.capg.onlineplant.entity.Cart;

@Transactional
@Repository
public class CartDaoImpl implements CartDao {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public Cart addCart(Cart cart) {
		return entityManager.merge(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return entityManager.merge(cart);
	}

	@Override
	public Cart removeCart(Cart cart) {
		Cart pt=entityManager.find(Cart.class, cart);
		 entityManager.remove(cart);
		return pt;
	}
	
	@Override
	public List<Cart> viewAllCarts() {
		Query q = entityManager.createQuery("select e from Cart e");
	    List<Cart> list=q.getResultList();
		return list;
	}

}
