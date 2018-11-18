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
</head>
<body>
<%@include file="Header.jsp" %>
<div  class="container-fuild">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
<h1>create issue </h1> 
<form action="createissue.do" method="post">
    
    <div class="form-group">
        <label for="projectname" >ProjectName:</label>
        <select  class="form-control input-sm" id="projectname" name="project">
            <option>-----projectName-------</option>
             <c:forEach items="${prolist}" var="pro">
     <option value="${pro}">${pro}</option>
     </c:forEach>
        </select>
    </div>
    <div class="form-group">
        <label for="type12"> Type:</label>
        <select class="form-control input-sm" id="type12"  name="type">
            <option>-----select------</option>
            <option>task</option>
            <option>bug</option>
        </select>
    </div>
    <div class="form-group">
    <label for="priority" > priority:</label>
        <select  class="form-control input-sm" id="priority"  name="priority">
            <option>----select-----</option>
            <option value="1">High</option>
            <option value="1">Low</option>
        </select>
    </div>
    <div class="form-group">
        <label for="description" > Description:</label>

            <textarea class="form-control input-sm" rows="5" id="description" name="description"></textarea>
        </div>
    <div class="form-group">
        <label for="assignto"> AssignTo:</label>
            <select  class="form-control input-sm" id="assignto" name="rname">
                <option>-----resourcetName-------</option>
             <c:forEach items="${rlist}" var="project">
     <option value="${project}">${project}</option>
     </c:forEach>
            </select>
        </div>
    <div class="form-group">
        <label for="status"> Status:</label>
  <input type="radio" name="status" value="pending" checked> pending<br>
            
        </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>

        </div>
        </div>
    </div>
     <%@include file="footer.jsp" %>
</body>
</html>