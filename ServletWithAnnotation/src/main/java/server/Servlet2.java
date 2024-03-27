package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/toPage2")
public class Servlet2 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		String name=req.getParameter("name");
		String surname=req.getParameter("surname");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String msg=(String) req.getAttribute("msg");
		
		PrintWriter out=resp.getWriter();
		out.println("Name : " + name);
		out.println("Surname : " + surname);
		out.println("Age : " + age);
		out.println("Email : " + email);
		out.println("Gender : " + gender);
		out.println();
		out.println(msg);
	}

}
