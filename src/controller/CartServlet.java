package controller;
//sujit kumar
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.food.dao.CartDao;
import com.food.dao.CartDaoImpl;
import com.food.pojo.Cart;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	      
	
	CartDao ctd=new CartDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		 PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		String custemail=(String)session.getAttribute("User");
		boolean flag;
		if(action!=null && action.equals("addtocart"))
		{
			int foodid=Integer.parseInt(request.getParameter("id"));
			int quantity=1;
			
			Cart c=new Cart(foodid,quantity,custemail);
			
			flag=ctd.addToCart(c);
			if(flag)
			{
				out.println("cart added succesfully...");
			}
			else{
				out.println("something went wrong...");
				out.println("new feture1");
				out.println("new feture2");
			}
			
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
