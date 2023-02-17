<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<center>
	<br>
	<br>
	<br>
	<h1>REGISTRAION FORM</h1>
		<form method="post" action="FormServlet">
			<table>
				<tr>
					<td>Name : </td>
					<td><input type="text" name="user_name" value="" placeholder="Enter User Name"></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><input type="password" name="user_password" value="" placeholder="Enter Password"></td>
				</tr>
				<tr>
					<td>Email : </td>
					<td><input type="email" name="user_email" value="" placeholder="Enter Email"></td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td>
						<input type="radio" name="user_gender" value="male">Male &nbsp;
						<input type="radio" name="user_gender" value="female">Female
					</td>
				</tr>
				<tr>
					<td>Select Course : </td>
					<td>
						<select name="user_course">
							<option values="java">Java</option>
							<option values="php">PHP</option>
							<option values="c++">C++</option>
							<option values="c">C</option>
						</select>
					</td>
				</tr>
				<tr>
					<td style="text-align: right;">
						<input type="checkbox" value="checked" name="condition"/>
					</td>
					<td>
						Agree Terms and Conditions.
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button type="submit">Submit</button>
						<button type="reset">Reset</button>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>