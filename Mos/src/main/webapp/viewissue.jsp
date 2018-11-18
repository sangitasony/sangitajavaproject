<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<br><br>
<br><br>

<br>

<br><br>
<h1>view issue </h1>

	<form action="viewissue.do" method="get">
		
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>SLNO</th>
						<th>IssueNo</th>
						<th>ProjectName</th>
						<th>Type</th>
						<th>Priority</th>
						<th>ResourceName</th>
						<th>status</th>
					</tr>
				</thead>


				<c:forEach var="view" items="${list}">
					<tr>
						<td>${view.id}</td>
						<td>${view.issueNO}</td>
						<td>${view.projectname}</td>
						<td>${view.type}</td>
						<td>${view.priority}</td>
						<td>${view.rname}</td>
						<td>${view.status}</td>
						
					</tr>
				</c:forEach>


			</table>
			</form>
			<form action="edit.do" method="get">
<input type="search" name="issueNO" class="text" required>
<input type="submit" value="search ">
</form>
		<%@include file="footer.jsp"%>

</body>
</html>