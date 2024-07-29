package controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.food.dao.LoginDao;
import com.food.dao.LoginDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	LoginDao ld=new LoginDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter out=response.getWriter();
		   HttpSession session=request.getSession();
		   
		   String username,password,type;
		   boolean flag;
		   
		   username=request.getParameter("username");
		   password=request.getParameter("password");
		   type=request.getParameter("type");
		   
		   String action=request.getParameter("action");
		   
		   if(action!=null && action.equals("login"))
		   {
		   if(type.equals("User"))
		   {
			   flag=ld.userLogin(username, password);
			   
			   if(flag) 
			   {
				   out.print("Login Successfull...");   
				   session.setAttribute("User", username);
			       //response.sendRedirect("index.jsp");
			   
			   }
			   else
			   {
				 //out.print("Login Failed.");
			     request.setAttribute("loginfaild", "invalid user name..");
			     
			     RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			     rd.forward(request, response);
			   
			   }
		   }
		   else  if(type.equals("Admin")){
			   flag= ld.adminLogin(username, password);
		   if(flag) 
		   {
			   out.print("Login Successfull...");  
			   
			  // session.setAttribute("Admin", username);
		       //response.sendRedirect("index.jsp");
		   
		   }
		   else
		   {
			 //out.print("Login Failed.");
		     request.setAttribute("loginfaild", "invalid user name..");
		     RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		     rd.forward(request, response);
		   
		   }
		   
	   }
		   
	}
		   
		   
		   }
	}
	
