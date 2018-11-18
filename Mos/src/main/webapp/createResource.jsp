<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<div>
		<div class="container-fuild">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<br> <br>
<h1>CreateResource</h1>
<div  align="right">${username}</div>
<h3>${msg}</h3>
      <form action="createresource.do"method="post">
      <div class="form-group">
      ResourceName:<input type="text" name="rname" class="form-control input-sm">
      </div>
      <div class="form-group">
      Degination: <select name="degination" class="form-control input-sm">
				                <option value="SoftwareDevelopers">SoftwareDevelopers</option>
				                <option value="Tester">Tester</option>
                                <option value="teamLead">teamLead</option>
                                <option value="businessAnalistw">businessAnalist</option>
                                </select> 
                                </div>
                                <div class="form-group"> 
     EmpNo:<input type="text" name="empno" class="form-control input-sm" >
     </div>
     <div class="form-group">
     project: <select name="project" class="form-control input-sm">
      <option>----project name----</option>
     <c:forEach items="${prolist}" var="project">
    
     <option value="${project}">${project}</option>
     </c:forEach>
             
              </select> 
              </div>
              <div class="form-group">
        Email:<input type="email"name="email" class="form-control input-sm" >
        </div>
        <div class="form-group">
  ManagerEmail:<input type="email"name="mangeremail" class="form-control input-sm">
  </div>
  <input type="submit" class="btn btn-default" value="create" >
         <br>
      </form>     
      </div>
      </div></div>
      </div>   
      <br>
      <br>
      <br>                
<%@include file="footer.jsp" %>
</body>
</html>