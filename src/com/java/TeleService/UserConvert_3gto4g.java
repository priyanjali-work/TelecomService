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

/**
 * Servlet implementation class UserConvert_3gto4g
 */
@WebServlet("/UserConvert_3gto4g")
public class UserConvert_3gto4g extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String name = request.getParameter("name");
		String network = request.getParameter("network");
		String contact = request.getParameter("contact");
		String id_proof = request.getParameter("id_proof");
		
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		if(name.isEmpty() || network.isEmpty() || contact.isEmpty() || 
				id_proof.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("convert_3gto4g.jsp");
			req.include(request, response);
		}
		
		else
			
		{
			
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection(
		                    "jdbc:mysql://localhost:3306/telecom", "root", "Ranjan#84");
		 
		            PreparedStatement ps = con
		                    .prepareStatement("Insert into convert_3gto4g(name,network,contact,id_proof) values (?,?,?,?);");
		 
		            ps.setString(1, name);
		            ps.setString(2, network);
		            ps.setString(3, contact);
		            ps.setString(4, id_proof);
		          
		 
		            int i = ps.executeUpdate();
		            if (i > 0)
		            {
		            	
		                out.print("You have requested successfully...");
		                
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

  