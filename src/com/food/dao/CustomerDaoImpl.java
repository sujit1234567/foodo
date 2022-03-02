package com.food.dao;

import java.util.ArrayList;
import java.util.List;

import com.food.pojo.Customer;
import com.food.pojo.Food;
import com.food.utility.DBConnection;
import java.sql.*;

public class CustomerDaoImpl implements CustomerDao {

	Connection con=DBConnection.getConnection();
	PreparedStatement ps=null;
	String sql;
	int result;
	Customer cust;
	
	
	@Override
	public boolean addCustomer(Customer c) {
		
		sql="insert into customer(custname,custemail,custpassword,custcontact,custaddress) values(?,?,?,?,?)";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, c.getCustname());
			ps.setString(2, c.getCustemail());
			ps.setString(3, c.getCustpassword());
			ps.setString(4, c.getCustcontact());
			ps.setString(5, c.getCustaddress());
			
			 result=ps.executeUpdate();
			
			 
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
	public boolean updateCustomer(Customer c) {
		

		

           
          try {
        	  sql="update customer set custname=?,custemail=?,custpassword=?,custcontact=?,custaddress=? where custid=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, c.getCustname());
			ps.setString(2, c.getCustemail());
			ps.setString(3, c.getCustpassword());
			ps.setString(4, c.getCustcontact());
			ps.setString(5, c.getCustaddress());
			ps.setInt(6, c.getCustid());
			  result=ps.executeUpdate();
			
			
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
	public boolean deleteCustomer(int Customerid) {
		
		sql="delete from customer where custid=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, Customerid);
			
		int	result=ps.executeUpdate();
		
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
	public Customer searchCustomerById(int Customerid) {
		
		
		
		try {
			sql="select * from customer where custid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, Customerid);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
			    cust=new Customer();
				cust.setCustid(rs.getInt(1));
				cust.setCustname(rs.getString(2));
				cust.setCustemail(rs.getString(3));
				cust.setCustpassword(rs.getString(4));
				cust.setCustcontact(rs.getString(5));
				cust.setCustaddress(rs.getString(6));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cust;
	}

	@Override
	public List<Customer> searchCustomerByName(String Customername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomerByEmail(String Customeremail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> showAllCustomer() {
		sql="select * from customer";
		List<Customer> list=new ArrayList();
		try {
			ps=con.prepareStatement(sql);
		    ResultSet rs=ps.executeQuery();
			
		    while(rs.next())
		    {
		        cust=new Customer();
		    	cust.setCustid(rs.getInt(1));
		    	cust.setCustname(rs.getString(2));
		    	cust.setCustemail(rs.getString(3));
		    	cust.setCustpassword(rs.getString(4));
		    	cust.setCustcontact(rs.getString(5));
		    	cust.setCustaddress(rs.getString(6));
		    	
		    	list.add(cust);
		    	
		    }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
