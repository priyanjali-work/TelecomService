package com.java.TeleService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.dao.LoginDao;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	    String userid = request.getParameter("userid");
	    String pass = request.getParameter("pass");
	    
	    LoginDao dao = new LoginDao();
	    
	    if(dao.check(userid, pass))
	    {
	    	
	    	HttpSession session = request.getSession();
	    	session.setAttribute("UserId", userid);
	    	response.sendRedirect("user.jsp");
	    	
	    }
	    
	    else
	    {
	    	response.sendRedirect("login.jsp");
	    }
		
	
	}


}
