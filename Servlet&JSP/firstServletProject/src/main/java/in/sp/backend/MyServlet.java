package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet  extends  HttpServlet
{

	   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub4
		 
		   // print in web browser 
		   
		   PrintWriter out = resp.getWriter();
		   out.print("i am in doGet()  method for browser ");
		   
		   
		   
		   
		   
		   // print on console
		System.out.println("I  am in doget() method ");
	}
	
}
