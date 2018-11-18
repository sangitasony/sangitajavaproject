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
<body>
<%@include file="Header.jsp" %>
<div>
		<div class="container-fuild">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<br> <br>
<h1>EditResourcepage</h1>
<div  align="right">${username}</div>
<h3>${msg}</h3>
      <form action="updaterecord.do"method="get">
      
      <input type="hidden" name="id" value=${rdto.id}>
 <div class="form-group">
      Name:<input type="text" name="rname" value=${rdto.rname} class="form-control input-sm">
      </div>
      <div class="form-group">
      Degination: <select name="degination" value=${rdto.degination} class="form-control input-sm">
				                <option value="SoftwareDevelopers">SoftwareDevelopers</option>
				                <option value="Tester">Tester</option>
                                <option value="teamLead">teamLead</option>
                                <option value="businessAnalist">businessAnalist</option>
                                </select>  
                                </div>
                                <div class="form-group">
     EmpNo:<input type="text" name="empno" value= ${rdto.empno} readonly="readonly" class="form-control input-sm">
    </div>
    <div class="form-group">
        Email:<input type="email"name="email" value= ${rdto.email} readonly="readonly"  class="form-control input-sm">
        </div>
        <div class="form-group">
  ManagerEmail:<input type="email" name="mangeremail" value= ${rdto.mangeremail} class="form-control input-sm" >
  </div>
 <div class="form-group">
   Project: <select name="project" value= ${rdto.project} class="form-control input-sm" >
     <c:forEach items="${prolist}" var="project">
     <option value="${project}">${project}</option>
     </c:forEach>
             
              </select> 
            </div>
          
  <input type="submit" class="btn btn-default" value="update" >
  <input type="reset"  class="btn btn-default" value="reset" >
           
      </form>
      </div>
      </div>
      </div>                         
<%@include file="footer.jsp" %>
</body>

</html>