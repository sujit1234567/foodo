package com.food.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


import com.food.pojo.Food;
import com.food.utility.DBConnection;

public class FoodDaoImpl implements FoodDao{

	Connection con=DBConnection.getConnection();
	PreparedStatement ps=null;
	String sql;
    int  result;
	Food food;
	@Override
	public boolean AddFood(Food f) {
		sql="insert into food(foodname,foodtype,foodcategory,foodimage,fooddescription,foodprice) values(?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, f.getFoodname());
			ps.setString(2, f.getFoodtype());
			ps.setString(3, f.getFoodcategory());
			ps.setString(4, f.getFoodimage());
			ps.setString(5, f.getFooddescription());
			ps.setDouble(6, f.getFoodprice());
			
			
			
			result=ps.executeUpdate();
		}
		catch (Exception e) {
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
	public boolean UpdateFood(Food f) {
		try
		{
			sql="update food set foodname=?, foodtype=?, foodcategory=?, foodimage=?, fooddescription=?, foodprice=? where foodid=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, f.getFoodname());
			ps.setString(2, f.getFoodtype());
			ps.setString(3, f.getFoodcategory());
			ps.setString(4, f.getFoodimage());
			ps.setString(5, f.getFooddescription());
			ps.setDouble(6, f.getFoodprice());
			ps.setInt(7,f.getFoodid());
			
			result=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(result>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	@Override
	public boolean deleteFood(int foodid) {
		
		sql="delete from food where foodid=?";
		
	       try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, foodid);
	        result=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	@Override
	public List<Food> showAllFood() {
		sql="select * from food";
		List<Food> list=new ArrayList();
		try {
			ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				food=new Food();
				food.setFoodid(rs.getInt(1));
				food.setFoodname(rs.getString(2));
				food.setFoodtype(rs.getString(3));
				food.setFoodcategory(rs.getString(4));
				food.setFoodimage(rs.getString(5));
				food.setFooddescription(rs.getString(6));
			    food.setFoodprice(rs.getDouble(7));
				
				list.add(food);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public Food searchFoodById(int foodid) {
		
		sql="select * from food where foodid=?";
		
		try {
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, foodid);
			
			ResultSet rs=ps.executeQuery();
			
			
			while(rs.next())
			{
			    food=new Food();
				food.setFoodid(rs.getInt(1));
				food.setFoodname(rs.getString(2));
				food.setFoodcategory(rs.getString(3));
				food.setFoodprice(rs.getDouble(4));
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return food;
	}
	@Override
	public List<Food> searchFoodByName(String foodname) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Food> searchFoodByCategory(String foodcategory) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}


