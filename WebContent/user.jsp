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
	
	<%
	  // response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	  // response.setHeader("pragma", "no-cache");
	  // response.setHeader("Expire", "0");
	   
	
	   if(session.getAttribute("UserId")==null)
	   {
		   response.sendRedirect("login.jsp");
	   }
	%>
	
	<div style="text-align:right; ">
		<form action="Logout">
		<input type="submit" value="Logout">
	    </form>
   </div>
   
   <p> If Already sent the request then  <b> <a style="color:blue;" href="user_requested_data.jsp"> Click here</a> </b> to check status.. </p>
	
	<!-- JSTL tag -->
	
  <h1  style="text-align:left;">	Welcome ${UserId}      </h1>



<h2>Fill the Portability form</h2>


      <form action="UserSimPortability" method="get">
			<table>
			
			   <tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>From Network</td>
					<td><input type="text" name="from_network" /></td>
				</tr>
				<tr>
					<td>To Network</td>
					<td><input type="text" name="to_network" /></td>
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


<p>Want to convert network from 3G to 4G then  <b> <a style="color:blue;" href="convert_3gto4g.jsp"> Click here</a> </b> </p>

<%@ include file="footer.jsp" %>
</body>
</html>