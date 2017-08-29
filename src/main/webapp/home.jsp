<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MY APP</title>
</head>
<body>
	<h1 style="color: red">Welcome</h1>
	<hr>
	<br>
	<a href="addEmp">Add New Employee</a>
	<br>
	<a href="listEmp">List All Employees</a>
	<br>
	<a href="addDept">Add Department</a>
	<br>
	<a href="deptList">Department Details</a>
	<br> 
	<form method="GET" action="">
	Get Employee by Department_ID
	<input type="text" name="did">
	<input type="submit" value="Search">
	</form>
</body>

</html>