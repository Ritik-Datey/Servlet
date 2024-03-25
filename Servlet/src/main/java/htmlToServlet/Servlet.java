package htmlToServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{
	
	//To retrive data from web we have to use get or post method......
	// we also need to provide a path to the xml file to established the connection....
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doPost(req, resp);
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		int age=Integer.parseInt(req.getParameter("age"));
		
		PrintWriter out=resp.getWriter();
		out.println("Name : " + name);
		out.println("Email : " + email);
		out.println("Gender : " + gender);
		out.println("Age : " + age);
	
		
	}
//	<servlet>
//    <servlet-name>htmltoservlet</servlet-name>
//    <servlet-class>htmlToServlet.Servlet1</servlet-class>
//  </servlet>
//  <servlet-mapping>
//    <servlet-name>htmltoservlet</servlet-name>
//    <url-pattern>/toServlet</url-pattern>
//  </servlet-mapping>

}
