<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>List of Departments</title>
</head>
<body>
	<h1>List of Departments</h1>
	<h2>
		<a href="addDept">add Department</a>
	</h2>
	<a href="home1">Home</a>
	<br>
		<table border="1">
			<tr>
				<th>Department ID</th>
				<th>Department Name</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="dept" items="${department}" >
				<tr>
					<td>${dept.dept_id}</td>
					<td>${dept.dname}</td>
					<td align="center"><a href="editDept?id=${dept.dept_id }">edit</a></td>
					<td><a href="deleteDept?id=${dept.dept_id }">delete</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>