package com.food.pojo;

public class Food {

	private int foodid;
	private String foodname;
	private String foodtype;
    private String foodcategory;
	private String foodimage;
	private String fooddescription;
	private double foodprice;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(int foodid, String foodname, String foodtype, String foodcategory, String foodimage,
			String fooddescription, double foodprice) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodtype = foodtype;
		this.foodcategory = foodcategory;
		this.foodimage = foodimage;
		this.fooddescription = fooddescription;
		this.foodprice = foodprice;
	}
	public Food(String foodname, String foodtype, String foodcategory, String foodimage, String fooddescription,
			double foodprice) {
		super();
		this.foodname = foodname;
		this.foodtype = foodtype;
		this.foodcategory = foodcategory;
		this.foodimage = foodimage;
		this.fooddescription = fooddescription;
		this.foodprice = foodprice;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public String getFoodcategory() {
		return foodcategory;
	}
	public void setFoodcategory(String foodcategory) {
		this.foodcategory = foodcategory;
	}
	public String getFoodimage() {
		return foodimage;
	}
	public void setFoodimage(String foodimage) {
		this.foodimage = foodimage;
	}
	public String getFooddescription() {
		return fooddescription;
	}
	public void setFooddescription(String fooddescription) {
		this.fooddescription = fooddescription;
	}
	public double getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(double foodprice) {
		this.foodprice = foodprice;
	}
	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", foodname=" + foodname + ", foodtype=" + foodtype + ", foodcategory="
				+ foodcategory + ", foodimage=" + foodimage + ", fooddescription=" + fooddescription + ", foodprice="
				+ foodprice + "]";
	}
	
	
	
	
	
	
}
