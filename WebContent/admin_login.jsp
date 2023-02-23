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
<body style="text-align:center;">
  
  <h2>Admin can Login here...</h2>
  
  <form action="Admin_Login" >
			<table>
				<tr>
					<td>AdminId</td>
					<td><input type="text" name="adminid" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass" /></td>
				</tr>
			</table>
			
			<input type="submit" value="login">
			
	<!-- 		
		<p>  If Not Register then Register here...	<a href="admin_register.jsp">Admin_Register</a>    </p>
	 -->
	 		
	</form>			


<br><br><br><br><br><br>
<%@ include file="footer.jsp" %>
</body>
</html>