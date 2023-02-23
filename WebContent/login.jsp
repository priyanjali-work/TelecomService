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
  
  <h2>User can Login here...</h2>
  <form action="Login" >
			<table>
				<tr>
					<td>UserId</td>
					<td><input type="text" name="userid" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass" /></td>
				</tr>
			</table>
			
			<input type="submit" value="login">
		<p>If Not Registered then Register here...<b>	<a href="Register_1.jsp">Register</a> </b>  </p>
				
	</form>			


<br><br><br><br><br><br>
<%@ include file="footer.jsp" %>
</body>
</html>