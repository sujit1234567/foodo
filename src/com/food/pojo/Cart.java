package com.food.pojo;

public class Cart {
	
	private int  cartid,foodid,quantity;
	private String foodname,foodcategory,custemail;
	private double foodprice;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cart(int foodid, int quantity, String custemail) {
		super();
		this.foodid = foodid;
		this.quantity = quantity;
		this.custemail = custemail;
	}

	public Cart(int cartid, int foodid, int quantity, String custemail) {
		super();
		this.cartid = cartid;
		this.foodid = foodid;
		this.quantity = quantity;
		this.custemail = custemail;
	}
	public Cart(int foodid, int quantity, String foodname, String foodcategory, String custemail, double foodprice) {
		super();
		this.foodid = foodid;
		this.quantity = quantity;
		this.foodname = foodname;
		this.foodcategory = foodcategory;
		this.custemail = custemail;
		this.foodprice = foodprice;
	}
	public Cart(int carid, int foodid, int quantity, String foodname, String foodcategory, String custemail,
			double foodprice) {
		super();
		this.cartid = carid;
		this.foodid = foodid;
		this.quantity = quantity;
		this.foodname = foodname;
		this.foodcategory = foodcategory;
		this.custemail = custemail;
		this.foodprice = foodprice;
		
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getFoodcategory() {
		return foodcategory;
	}

	public void setFoodcategory(String foodcategory) {
		this.foodcategory = foodcategory;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

	public double getFoodprice() {
		return foodprice;
	}

	public void setFoodprice(double foodprice) {
		this.foodprice = foodprice;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", foodid=" + foodid + ", quantity=" + quantity + ", foodname=" + foodname
				+ ", foodcategory=" + foodcategory + ", custemail=" + custemail + ", foodprice=" + foodprice + "]";
	}
	

}
