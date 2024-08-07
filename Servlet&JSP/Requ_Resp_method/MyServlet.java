package in.we.raj;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 @WebServlet("/submit-form")
public class MyServlet  extends HttpServlet
{
      @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// use  HttpServletRequest method 
    	String mynamef =   req.getParameter("fname");
    	String mylastf =   req.getParameter("lname");
    	// HttpServletResponse  method
    	PrintWriter out = resp.getWriter();
    	out.print(mynamef);
    	out.print(mylastf);
    	  
    	  System.out.println(" httpServletReques and responce ");
    	  
    	  
    }
	  
}
