package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginDao
{   
	
	String sql ="select * from register where userid=? and pass=?";
	String url="jdbc:mysql://localhost:3306/telecom";
	String username = "root";
	String password = "Ranjan#84";
	
  public boolean check(String userid, String pass)
  
  { 
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
	      Connection con = DriverManager.getConnection(url,username,password);
	      PreparedStatement st = con.prepareStatement(sql);
	      
		  st.setString(1, userid);
		  st.setString(2, pass);
		  
		  ResultSet rs = st.executeQuery();
		  if(rs.next())
		  {
			  return true;
		  }
          
		  
	  	}
	  	catch(Exception e)
	  	{
		  e.printStackTrace();
	  	}
	  
	  
	  return false;
  }
}
