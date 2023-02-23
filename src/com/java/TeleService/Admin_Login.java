package com.java.TeleService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.dao.AdminLoginDao;
import com.java.dao.LoginDao;


@WebServlet("/Admin_Login")
public class Admin_Login extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	    String adminid = request.getParameter("adminid");
	    String pass = request.getParameter("pass");
	    
	   // AdminLoginDao dao = new AdminLoginDao();
	    
	   // if(dao.check(adminid, pass))
	    
	    if(adminid.equals("Ranjan") && pass.equals("Ranjan"))
	    {
	    	
	    	HttpSession session = request.getSession();
	    	session.setAttribute("AdminId", adminid);
	    	response.sendRedirect("admin.jsp");
	    	
	    
	    }
	    
	    else
	    {
	    	response.sendRedirect("admin_login.jsp");
	    }
		
	
	}


}
