<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee details</h2>
	<form method="POST" action="saveDept">
		<table>
			<tr>
				<td>Department Id</td>
				<td><input type="text" name="dept_id"></td>
			</tr>
			<tr>
				<td>Department Name</td>
				<td><input type="text" name="dname"></td>
			</tr>

			<td colspan="2"><input type="submit" value="Submit"></td>

		</table>

	</form>

</body>
</html>