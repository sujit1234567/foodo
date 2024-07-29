package controller;
//take this..
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
//take this

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.food.dao.CustomerDao;
import com.food.dao.CustomerDaoImpl;
import com.food.pojo.Customer;



/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	CustomerDao cd=new CustomerDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		PrintWriter out=response.getWriter();
	String action=request.getParameter("action");
		HttpSession session=request.getSession();
		
		if(action!=null && action.equals("update"))
		{
			int Cid=Integer.parseInt(request.getParameter("id"));
	
	           Customer customerid=cd.searchCustomerById(Cid);
	                  
	           session.setAttribute("custid", customerid);
	           response.sendRedirect("CustomerUpdate.jsp");
		}
		else if(action!=null && action.equals("delete"))
		{
			int custid=Integer.parseInt(request.getParameter("id"));
			List<Customer> clist=new ArrayList<>();
		      boolean  flag=cd.deleteCustomer(custid);
			if(flag)
			{
				clist=cd.showAllCustomer();
				session.setAttribute("clist", clist);
				response.sendRedirect("CustomerList.jsp");
				
			}
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		List<Customer> custlist=new ArrayList<Customer>();
		
		int custid;
		String custname,custemail,custpassword,custcontact,custaddress;
		boolean flag;
		Customer c;
		
		
		String action=request.getParameter("action");
		
		if(action!=null && action.equals("add"))
		{
			
			 custname=request.getParameter("custname");
			 custemail=request.getParameter("custemail");
			 custpassword=request.getParameter("custpassword");
			 custcontact=request.getParameter("custcontact");
			 custaddress=request.getParameter("custaddress");
			 
			  c=new Customer(custname,custemail,custpassword,custcontact,custaddress);
			  flag=cd.addCustomer(c);
			  System.out.println("flag"+flag);
			  if(flag)
			  {
				  
				 // out.print("customer added succesfully..");
				  custlist=cd.showAllCustomer();
				  session.setAttribute("clist", custlist);
				  response.sendRedirect("CustomerList.jsp");
				  
			  }
			  else{
				  out.println("something went wrong.....");
			  }
			 
			
			
		}
		else if(action!=null && action.equals("update"))
		{
			custid=Integer.parseInt(request.getParameter("custid"));
			custname=request.getParameter("custname");
		  custemail=request.getParameter("custemail");
		custpassword=request.getParameter("custpassword");
		custcontact=request.getParameter("custcontact");
		custaddress=request.getParameter("custaddress");
		
		Customer cust=new Customer(custid,custname,custemail,custpassword,custcontact,custaddress);
		
		flag=cd.updateCustomer(cust);
		if(flag)
		{
			//out.println("update successfully....");
			List<Customer> culist=new ArrayList<>();
			culist=cd.showAllCustomer();
			session.setAttribute("clist", culist);
			response.sendRedirect("CustomerList.jsp");
		}else{
			out.println("something went wrong..");
		}
		}
		
		
	}

}
