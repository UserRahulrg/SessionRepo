<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<%
		String msg = (String)request.getAttribute("msg");
	
	%>
	
	<form action ="LoginController" method ="post">0
	
	<% if() %>
	
	<label>Username</label><br>
	<input type="text" placeholder="Enter your Username" name ="username"><br>
	
	<label>Password</label><br>
	<input type="password" placeholder="Enter your Password" name ="password"><br>
	
	
	</form>
	

</body>
</html>