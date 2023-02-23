<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<%@ include file="header.jsp" %>
<link rel="stylesheet" href="style.css" type=text/css>
</head>

<body style="text-align:center;" >
<h1>Admin Registration Form</h1>
<form action="Admin_Registration" method="get">
			<table >
				<tr>
					<td>Name</td>
					<td ><input type="text" name="name" /></td>
				</tr>
	            <tr>
					<td>AdminId</td>
					<td><input type="text" name="adminid" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Contact No.</td>
					<td><input type="text" name="contact" /></td>
				</tr>
				 
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass" /></td>
				</tr>
				</table>
        		<input type="submit" value="Submit" />
        	<p>If Register then login here...     <a href="admin_login.jsp">Admin_Login</a>    </p>
        	</form>
        		
        		
   <%@ include file="footer.jsp" %>     		
</body>
</html>