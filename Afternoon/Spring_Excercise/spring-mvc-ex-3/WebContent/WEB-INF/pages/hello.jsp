<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<h3>All Employees Information</h3>
	<table border = "1">
		<tr>
			<th>Id</th><th>Name</th><th>Salary</th>
		</tr>
		<c:forEach items="${msg}" var = "e">
			<tr>
				<td>${e.id}</td><td>${e.name}</td><td>${e.salary}</td>
			</tr>
		</c:forEach>	
	</table>
	<hr />
</body>
	
</body>
</html>