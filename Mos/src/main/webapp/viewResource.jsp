<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	
		<%@include file="Header.jsp"%>
		<br>
		<br>
		<br>
		<br>
		
		<div class="container">
		<div  align="right">${username}</div>
			<h2>View ResourceDetails</h2>
			<br>
			<br>
			<form action="getView.do" method="get">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>SLNO</th>
						<th> ResourceName</th>
						<th> Degination</th>
						<th> EmpNo</th>
						<th>Email</th>
						<th>managerEmail</th>
						<th>project</th>
						<th>Edit</th>
					</tr>
				</thead>


				<c:forEach var="view" items="${list}">
					<tr>
						<td>${view.id}</td>
						<td>${view.rname}</td>
						<td>${view.degination}</td>
						<td>${view.empno}</td>
						<td>${view.email}</td>
						<td>${view.mangeremail}</td>
						<td>${view.project}</td>
						
						<td><a href="editbasedId.do?id=${view.id}">Edit</a></td>
						<%-- <td style="display:none;">${view.password}</td> --%>
					</tr>
				</c:forEach>


			</table>
				</form>
		</div>
		
		<%@include file="footer.jsp"%>

</body>
</html>