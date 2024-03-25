package htmlToServletToServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		int age=Integer.parseInt(req.getParameter("age"));
		String msg=req.getParameter("msg");
		
		PrintWriter out=resp.getWriter();
		out.println("Name : " + name);
		out.println("Email : " + email);
		out.println("Gender : " + gender);
		out.println("Age : " + age);
		out.println("msg :" + msg);
	}
}
