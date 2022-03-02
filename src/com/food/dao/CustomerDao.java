package com.food.dao;

import java.util.List;

import com.food.pojo.Customer;

public interface CustomerDao {

	    boolean addCustomer(Customer c);
	    boolean updateCustomer(Customer c);
	    boolean deleteCustomer(int Customerid);
	    List<Customer> showAllCustomer();
	    Customer searchCustomerById(int Customerid);
	    List<Customer> searchCustomerByName(String Customername);
	    Customer searchCustomerByEmail(String Customeremail);
	
	
}
