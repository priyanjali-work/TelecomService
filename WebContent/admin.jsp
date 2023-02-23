<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="header.jsp" %>
</head>
<body>

   
   <% 
   
   //response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   //response.setHeader("pragma", "no-cache");
   //response.setHeader("Expire", "0");
   
   
	   if(session.getAttribute("AdminId")==null)
	   {
		   response.sendRedirect("admin_login.jsp");
	   }
	%>
	
<div style="text-align:right; ">
	<form action="Admin_Logout">
	<input type="submit" value="Logout">
    </form>
</div>

	<!-- JSTL tag -->
	<h1 style="text-align:left;">Welcome ${AdminId}  </h1>
	
	

      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>




<%@ include file="footer.jsp" %>
</body>
</html>