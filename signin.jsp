<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign_in</title>
<script type="text/javascript" src="Script/signin.js"></script>
</head>
<body>
    <center>
	<h2>Login</h2>
	<form action="Login" method="post" onsubmit="return validatesignin()">
	<table>
	<tr>
		<th>Email Address</th>
		
		<td>
			<input type="text" name="email" placeholder="email" id="email"/>
		</td>
	</tr>
	<tr>
		<th>Password</th>
		<td>
			<input type="password" name="password" placeholder="password" id="password"/>
			
			
		</td>
		</tr>
		<tr>
				<td align="CENTER" colspan="2"><button type="submit">Signin</button></td>
		</tr>
	</table>
	</form>
	</center>
</body>
</html>