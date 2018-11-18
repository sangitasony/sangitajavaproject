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
<br>
<br>
<br>
<div  align="right">${username}</div>
	<form action="viewproject.do" method="get">
		<%@include file="Header.jsp"%>
		<div class="container">
			<h2>View Project</h2>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>SLNO</th>
						<th>ProjectName</th>
						<th>Domain</th>
						<th>ProjectCode</th>
						<th>StartDate</th>
						<th>EstimateDate</th>
						<th>Status</th>
						<th>Action</th>
					</tr>
				</thead>


				<c:forEach var="view" items="${list}">
					<tr>
						<td>${view.id}</td>
						<td>${view.projectname}</td>
						<td>${view.domain}</td>
						<td>${view.projectcode}</td>
						<td>${view.stDate}</td>
						<td>${view.estimateDate}</td>
						<td>${view.status}</td>
						<td><a href="updatestatus.do?id=${view.id}&st=${view.status}">Action</a></td>
					</tr>
				</c:forEach>


			</table>
		</div>
		<%@include file="footer.jsp"%>
	</form>
</body>
</html>