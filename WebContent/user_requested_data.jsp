<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="header.jsp" %>
</head>
<body>

<div style="text-align:right; ">
		<form action="login.jsp">
		<input type="submit" value="Logout">
	    </form>
   </div>
   
   <div style="text-align:left; ">
		<form action="user.jsp">
		<input type="submit" value="Back">
	    </form>
   </div>
 
   <br><br>
   
   
     User data......


     <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>


<%@ include file="footer.jsp" %>
</body>
</html>