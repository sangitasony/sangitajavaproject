<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<%@include file="Header.jsp" %>
<div  class="container-fuild">
    <div class="row">
    
        <div class="col-md-6 col-md-offset-3">
        <br><br>
        <br><br>


<!-- Default form login -->
<form action="resourcelogin.do"method="get">
<h3>${msg}</h3>
<h2>ResourceLogin</h2>
    <div class="form-group">
        <label for="email" >Email:</label>
        <input type="email" class="form-control input-sm" id="email"  name="email">
    </div>
<div class="form-group">
        <label for="password" >Password:</label>
        <input type="password" class="form-control input-sm" id="password"  name="password">
        
    </div>
<button type="submit" class="btn btn-default">Submit</button><br><br><br>

</form>
</div>
</div>
</div> 

 

<%@include file="footer.jsp" %>
</body>
</html>
