<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<!-- for printing errors -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="alert alert-danger" role="alert" style="color: red;">
		<!-- 	this is for printing errors on form.jsp page
 -->
 
 	<!-- for printing errors -->
		<form:errors path="student.*" />

	</div>
	<form name="myForm" action="handleform" method="post">
		<table>
			<tr>
				<td><label for="name">Name:</label></td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			
			
			<tr>
				<td><label for="studentId">YourId:</label></td>
				<td><input type="text" id="studentId" name="studentId"></td>
			</tr>
			
			<tr>
				<td><label for="dob">Date of Birth:</label></td>
				<td><input type="text" id="dob" name="dob"></td>
			</tr>
			<tr>
				<td><label for="address">Address:</label></td>
				<td><input type="text" id="city" name="city" placeholder="City">
					<input type="text" id="state" name="state" placeholder="State">
				</td>
			</tr>
			<tr>
				<td><label for="course">Course:</label></td>
				<td><select id="course" name="course[]" multiple>
						<option value="math">Math</option>
						<option value="science">Science</option>
						<option value="english">English</option>
				</select></td>
			</tr>
			<tr>
				<td><label for="gender">Gender:</label></td>
				<td><input type="radio" id="male" name="gender" value="male">
					<label for="male">Male</label> <input type="radio" id="female"
					name="gender" value="female"> <label for="female">Female</label>
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;"><input
					type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>
