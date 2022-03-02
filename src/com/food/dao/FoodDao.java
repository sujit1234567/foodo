package com.food.dao;

import java.util.List;


import com.food.pojo.Food;

public interface FoodDao {

	boolean AddFood(Food f);
	boolean UpdateFood(Food f);
	boolean deleteFood(int foodid);
	List<Food> showAllFood();
	Food searchFoodById(int foodid);
	List<Food> searchFoodByName(String foodname);
	List<Food> searchFoodByCategory(String foodcategory);
	
	
	
	
}
