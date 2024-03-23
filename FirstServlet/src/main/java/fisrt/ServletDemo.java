package fisrt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		
		// To print output in form of html page directly without creating it the we use printwriter
		
		PrintWriter out=resp.getWriter();
		out.println(name + " " + email);
	}

}
