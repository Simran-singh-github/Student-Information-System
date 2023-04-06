<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign_up</title>
<script type="text/javascript" src="Script/signup.js"></script>
</head>
<body>
	<center>
		<h1>Student Registration Form</h1>
			<form name="signupform" action="register" method="POST"  onsubmit="return validatesignup() ">     
			<table border="0px solid #000" cellspacing="0" cellpadding="5">
			
			<tr>
				<th>S_id</th>
				<td><input type="number" placeholder="s_id" name="s_id" id="s_id" /></td>
			</tr>
			<tr>
				<th>First Name </th>
				<td><input type="text" placeholder="first_name" name="fname" id="first_name" /></td>
			</tr>
			<tr>
				<th>Last Name </th>
				<td><input type="text" placeholder="last name" name="lname" id="last_name" /></td>
			</tr>
			<tr>
				<th>Gender</th>
				<td>
						<input type="radio" value="Male" name="gender" id="Gender1"> Male
						<input type="radio" value="Female" name="gender" id="Gender2"> Female
						<input type="radio" value="Other" name="gender" id="Gender3"> Other
					
				</td>
			</tr>
			<tr>
				<th>Mobile Number </th>
				<td><input type="number" placeholder="Mobile no" name="mobile" id="Mobile_no" /></td>
			</tr>
			<tr>
				<th>Address </th>
				<td><textarea name="address" id="adrs" cols="30" rows="10"></textarea></td>
			</tr>
			<tr>
				<th>Course</th>
				<td>
					<select name="course" id="Course">
						<option value=""> Select</option>
						<option value="PYTHON"  id="PYTHON"> PYTHON</option>
						<option value="JAVA" id="JAVA"> JAVA</option>
						<option value="PHP" id="PHP">PHP </option>
						<option value="MYSQL" id="MYSQL"> MYSQL</option>
					</select>
				</td>
			</tr>
			<tr>
				<th> Email </th>
				<td><input type="text" placeholder="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<th> Password </th>
				<td><input type="password" placeholder="Password" name="password" id="Password" /></td>
			</tr>
			<tr>
				<td align="CENTER" colspan="2"><button type="submit">Signup</button></td>
			</tr>
			</table>
			</form>
	</center>
</body>
</html>