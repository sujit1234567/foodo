package com.food.dao;

import java.util.List;
//dao
import com.food.pojo.Cart;

public interface CartDao {
	
	boolean addToCart(Cart ca);
	boolean updateCart(Cart ca);
	boolean deleteFromCart( int cartid);
	boolean deleteFromCartByCustEmail(String custemail);
	List<Cart> showCart(String custemail);
	Cart searchFromCartById(int cartid);
	Cart searchFromCartByCustEmail(String custemail);

}
