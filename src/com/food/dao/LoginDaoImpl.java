package com.food.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.food.utility.DBConnection;

public class LoginDaoImpl implements LoginDao {

	Connection con=DBConnection.getConnection();
	PreparedStatement ps=null;
	String sql;
	int result;
	ResultSet rs=null;
	boolean flag;
	
	@Override
	public boolean userLogin(String username, String password) {
		
		
		try {
			sql="select * from customer where custemail=? and custpassword=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, password);
		    ResultSet rs=ps.executeQuery();
		    
			if(rs.next())
			{
				flag= true;
			}
			else{
				flag= false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return flag;
	}

	@Override
	public boolean adminLogin(String username, String password) {


		
		try {
			sql="select * from admin where adminname=? and adminpassword=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				
				flag=true;
			}
			else{
				flag=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean userChangePassword(String emailid, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminChangePassword(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
