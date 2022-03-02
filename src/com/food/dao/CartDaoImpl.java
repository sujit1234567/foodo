package com.food.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.food.pojo.Cart;
import com.food.utility.DBConnection;

public class CartDaoImpl implements CartDao{

	Connection con=DBConnection.getConnection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	Cart ca;
	int result;
	String sql;
	
	@Override
	public boolean addToCart(Cart ca) {
		
		sql="insert into cart(foodid,quantity,custemail) values(?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, ca.getFoodid());
			ps.setInt(2, ca.getQuantity());
			ps.setString(3, ca.getCustemail());
			
			result= ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result>0)
		{
			return true;
		}
		else{
		return false;
		}
		}

	@Override
	public boolean updateCart(Cart ca) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFromCart(int cartid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFromCartByCustEmail(String custemail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cart> showCart(String custemail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart searchFromCartById(int cartid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart searchFromCartByCustEmail(String custemail) {
		// TODO Auto-generated method stub
		return null;
	}

}
