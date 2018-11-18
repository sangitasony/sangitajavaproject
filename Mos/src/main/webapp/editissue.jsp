<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<body>
<%@include file="Header.jsp" %>
<div  class="container-fuild">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
<h1>EditIssue</h1>

<h3>${msg}</h3>
      <form action="update.do"method="get">
     <input type="hidden" name="id" value=${issue.id}>
      <div class="form-group">
        <label for="issuenumber" >IssueNumber:</label>
        <input type="text" class="form-control input-sm" id="issuenumber"  name="issuenum" value=${issue.issuenum} readonly="readonly">
    </div>
      <div class="form-group">
         <label for="projectname" >ProjectName:</label>
       <input type="text" class="form-control input-sm"  id="projectname"name="projectname" value=${issue.projectname} readonly="readonly">
    </div>
    
		<div class="form-group">
         <label for="type" >Type:</label>
       <input type="text" class="form-control input-sm" id="type" name="type" value= ${issue.type} readonly="readonly">
    </div>		                
     Type:
    
       <div class="form-group">
    <label for="priority" > priority:</label>
        <input  class="form-control input-sm" id="priority"  name="priority" value=${issue.priority} >
            
    </div>

 <div class="form-group">
        <label for=" resourceName">  ResourceName:</label>
            <input type="text" class="form-control input-sm"name="rname" value= ${issue.rname} readonly="readonly" id="resourceName">
        </div>
 <div class="form-group">
        <label for="description" > Description:</label>

            <textarea class="form-control input-sm" rows="5" id="description" name="description"></textarea>
        </div>
        <div>
   <label for="status"> Status:</label>
   <select class="form-control input-sm" name="status" value= ${issue.status}  id="status">
                <option>pending</option>
                <option>reject</option>
                <option>completed</option>
  </select>
     </div>
         
  <input type="submit" class="btn btn-default" value="update" >
  <input type="reset" class="btn btn-default" value="reset" >
         
         
      </form> 
      </div>
      </div>
      </div>                        
<%@include file="footer.jsp" %>
</body>

</html>