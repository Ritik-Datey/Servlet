package server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/toPage1")
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		String msg="Worked done we came from html to server1 to server2 then back to html without creating a page a normal text";
		
		req.setAttribute("msg", msg);
		
		RequestDispatcher rd=req.getRequestDispatcher("toPage2");
		rd.forward(req, resp);
		rd.include(req, resp);
	}

}
