<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>List of Employees</title>
</head>
<body>
	<h1>List of Employees</h1>
	<h2>
		<a href="addEmp">add Employee</a>
	</h2>
	<a href="home2">Home</a>
	<br>
		<table border="1">
			<tr>
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Salary</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="emp" items="${employee}" >
				<tr>
					<td>${emp.eid}</td>
					<td>${emp.ename}</td>
					<td>${emp.salary}</td>
					<td align="center"><a href="editEmp?id=${emp.eid }">edit</a></td>
					<td><a href="deleteEmp?id=${emp.eid }">delete</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>