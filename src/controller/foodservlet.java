package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
//qa changes
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//main...
import com.food.dao.FoodDao;
import com.food.dao.FoodDaoImpl;
import com.food.pojo.Food;

/**
 * Servlet implementation class foodservlet
 */
@WebServlet("/foodservlet")
public class foodservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	FoodDao fd=new FoodDaoImpl();
	boolean flag;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		List<Food> foodlist=new ArrayList<>();
		
		String action=request.getParameter("action");
		
		if(action!=null && action.equals("update"))
		{
		
		  int  foodid=Integer.parseInt(request.getParameter("id"));
		    Food food=fd.searchFoodById(foodid);
		    session.setAttribute("food", food);
			response.sendRedirect("updatefood.jsp");
		    
		
		}
		
		else if(action!=null && action.equals("delete"))
		{
			
			int foodid=Integer.parseInt(request.getParameter("id"));
			
			flag=fd.deleteFood(foodid);
			if(flag)
			{
				//out.println("food deleted successfully...");
			      //response.sendRedirect("FoodList.jsp");
			      foodlist=fd.showAllFood();
				  session.setAttribute("flist", foodlist);
				  response.sendRedirect("FoodList.jsp");
			}
			else{
				out.println("food not deleted...");
			}
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		//hello
		int foodid;
		String foodname,foodtype,foodcategory,foodimage,fooddescription;
		double foodprice;
		boolean flag;
		
		HttpSession session=request.getSession();
		
		List<Food> foodlist=new ArrayList<Food>();
		
		String action=request.getParameter("action");	
		
		if(action!=null && action.equals("add")) 
		  { 
		
		foodname=request.getParameter("foodname");
		foodtype=request.getParameter("foodtype");
		foodcategory=request.getParameter("foodcategory");
		foodimage=request.getParameter("foodimage");
		fooddescription=request.getParameter("fooddescription");
		foodprice=Double.parseDouble(request.getParameter("foodprice"));
		 
		
		Food f=new Food(foodname,foodtype,foodcategory,foodimage,fooddescription,foodprice);
		   
		   flag=fd.AddFood(f);
		   
		   
		   
		   if(flag){
			   //out.print("Food Added Successfully!!!");
			   
			   foodlist=fd.showAllFood();
			   session.setAttribute("flist",foodlist);
			   response.sendRedirect("FoodList.jsp");
			   
		   }
		   else{
			   
			   out.print("Something went wrong.....");
		   }
		   
		  
		  }
		else if(action!=null && action.equals("update"))
		{
			foodid=Integer.parseInt(request.getParameter("foodid"));
			foodname=request.getParameter("foodname");
			foodtype=request.getParameter("foodtype");
			foodcategory=request.getParameter("foodcategory");
			foodimage=request.getParameter("foodimage");
			fooddescription=request.getParameter("fooddescription");
			foodprice=Double.parseDouble(request.getParameter("foodprice"));
			
			 Food f=new Food(foodid,foodname, foodtype, foodcategory, foodimage, fooddescription, foodprice);
			 flag=fd.UpdateFood(f);
			
			
		if(flag)
		{
			   foodlist=fd.showAllFood();
			   session.setAttribute("flist",foodlist);
			   response.sendRedirect("FoodList.jsp");
		}
		else{
			
		}
		}
				
	  
	}
	   
		
		
		
		
		
		
		
		
		
	}


