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
	
	
	<div style="text-align:right; ">
		<form action="Logout">
		<input type="submit" value="Logout">
	    </form>
   </div>
   
   <div style="text-align:left; ">
		<form action="user.jsp">
		<input type="submit" value="Back">
	    </form>
   </div>
   
  



<h2>Fill the form for converting network from 3G to 4G</h2>


      <form action="UserConvert_3gto4g" method="get">
			<table>
			
			   <tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Network</td>
					<td><input type="text" name="network" /></td>
				</tr>
				
				<tr>
					<td>Mobile Number</td>
					<td><input type="text" name="contact" /></td>
				</tr>
				
				<tr>
					<td>Id Proof No.</td>
					<td><input type="text" name="id_proof" /></td>
				</tr>
			
				</table>
        		<input type="submit" value="Send Request" />
       </form>



	
<br><br>



<%@ include file="footer.jsp" %>
</body>
</html>