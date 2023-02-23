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


@WebServlet("/UserSimPortability")
public class UserSimPortability extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String name = request.getParameter("name");
		String from_network = request.getParameter("from_network");
		String to_network = request.getParameter("to_network");
		String contact = request.getParameter("contact");
		String id_proof = request.getParameter("id_proof");
		
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		if(name.isEmpty() || from_network.isEmpty() || to_network.isEmpty() ||  id_proof.isEmpty() || contact.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("user.jsp");
			req.include(request, response);
		}
		
		else
			
		{
			
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection(
		                    "jdbc:mysql://localhost:3306/telecom", "root", "Ranjan#84");
		 
		            PreparedStatement ps = con
		                    .prepareStatement("Insert into sim_portability(name,from_network,to_network,contact,id_proof) values (?,?,?,?,?);");
		 
		            ps.setString(1, name);
		            ps.setString(2, from_network);
		            ps.setString(3, to_network);
		            ps.setString(4, contact);
		            ps.setString(5, id_proof);
		            
		 
		            int i = ps.executeUpdate();
		            if (i > 0)
		            {
		            	
		                out.print("Your request is generated...");
		                
		                RequestDispatcher req = request.getRequestDispatcher("user_requested_data.jsp");
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

