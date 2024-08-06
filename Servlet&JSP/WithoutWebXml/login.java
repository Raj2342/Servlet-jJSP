package in.pc.bakoo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
   @WebServlet("/link")
public class login  extends HttpServlet
{
        @Override
        protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
         
        	    System.out.println("this is without web xml fiel ");
        }
}
