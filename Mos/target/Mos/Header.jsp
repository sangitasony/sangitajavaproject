<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Bootstrap 101 Template</title>

        <!-- Bootstrap -->
        <link href="bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>


</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top ">
    <div class="container">
        <div class="col-md-3" >

            <img  class="img-responsive" src="bootstrap-3.3.7-dist/img/moss.jpg" style="width: 200px">

        </div>
        <div class="col-md-9">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-target=".navbar-collapse" data-toggle="collapse">

            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
           <!-- menu-->

        </button>

        </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav ">
                 <li class="active"><a href="#">Home</a></li>
                <li><a href="adminlogin.jsp">adminlogin</a> </li>
                <li><a href="resourcelogin.jsp">resourceLogin</a> </li>
                 <li><a href="logout.do">logout</a> </li>
            </ul>
        </div>
        </div>

    </div>

</nav>

</body>
