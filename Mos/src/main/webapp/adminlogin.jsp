<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
 
<%@include file="Header.jsp" %>
<div  class="container-fuild">
    <div class="row">
    
        <div class="col-md-6 col-md-offset-3">
        <br><br>
        <br><br>
<form style="background-color:silver;" action="adminlogin.do" method="post">

<h3>${msg}</h3>
<h1>Log in to application</h1>
  <div class="form-group">
        <label for="userid" >UserId:</label>
        <input type="text" class="form-control input-sm" id="userid"  name="user">
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