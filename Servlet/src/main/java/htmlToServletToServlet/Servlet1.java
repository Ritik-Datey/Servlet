package htmlToServletToServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doPost(req, resp);
		
	String msg="Yes first it came to the servlet 1st page then through 2nd page it print";
	
	req.setAttribute("msg", msg);
	System.out.println("hi");
	
	RequestDispatcher rs=req.getRequestDispatcher("servlet2");
	rs.forward(req, resp);
	rs.include(req, resp);	
	}

}
