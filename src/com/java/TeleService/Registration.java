package com.java.TeleService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String pass = request.getParameter("pass");
		
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		if(name.isEmpty() || userid.isEmpty() || email.isEmpty() || 
				pass.isEmpty() || address.isEmpty() || contact.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("Register_1.jsp");
			req.include(request, response);
		}
		
		else
			
		{
			
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection(
		                    "jdbc:mysql://localhost:3306/telecom", "root", "Ranjan#84");
		 
		            PreparedStatement ps = con
		                    .prepareStatement("Insert into register(name,userid,email,contact,address,pass) values (?,?,?,?,?,?);");
		 
		            ps.setString(1, name);
		            ps.setString(2, userid);
		            ps.setString(3, email);
		            ps.setString(4, contact);
		            ps.setString(5, address);
		            ps.setString(6, pass);
		 
		            int i = ps.executeUpdate();
		            if (i > 0)
		            {
		            	
		                out.print("You are successfully registered...");
		                
		                RequestDispatcher req = request.getRequestDispatcher("login.jsp");
		    			req.include(request, response);
		            }
		        }
			 catch (Exception e)
			      {
		            out.print(e);
		          }
		 
		        out.close();
		    }
		}
		
	}

  