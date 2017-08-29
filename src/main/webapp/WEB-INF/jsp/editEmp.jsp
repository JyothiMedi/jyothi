<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Editing</title>
</head>
<body>
	<h2>Edit Employee Data</h2>
	<form method="POST" action="updateEmp">
		<table>
			<tr>
				<td>Employee ID</td>
				<td><input type="text" name="eid"
					value=<%=request.getAttribute("eid")%> readonly="true"></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="text" name="salary"></td>
			</tr>
			

			<td colspan="2"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>