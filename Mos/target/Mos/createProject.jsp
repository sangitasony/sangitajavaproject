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
	<%@include file="Header.jsp"%>
	<div>
		<div class="container-fuild">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<br> <br>

					<h1>create project</h1>
					<div align="right">${username}</div>
					<h3>${msg}</h3>

					<form action="create.do" method="post">
						<div class="form-group">
							<label for="projectname">ProjectName :</label>
								 <input type="text" name="projectname" class="form-control input-sm"id="projectname" />
						</div>
						<div class="form-group">
							Domain:<select name="domain" class="form-control input-sm">
								<option>Banking</option>
								<option>HealthCare</option>
								<option>Education</option>
								<option>logistics</option>
							</select><br>
						</div>
						<div class="form-group">
							ProjectCode :<input type="text" name="projectcode"
								class="form-control input-sm" />
						</div>
                    <div>
						StartDate:<input type="date" name="stDate"
							class="form-control input-sm">
				 </div>
				<div class="form-group">
					EstimateDate:<input type="date" name="estimateDate"
						class="form-control input-sm">
				</div>
				<div class="form-group">
					ProjectDescription:
					<textarea rows="5" cols="30" name="desc"
						class="form-control input-sm"></textarea>
				</div>
				<div class="form-group">
					Status:<input type="radio" name="status" value="1" />Active <input type="radio"
						name="status" value="0" checked />InActive
				</div>
				  <input type="submit" class="btn btn-default" value="Create"> <input type="reset"
					value="Reset">

				</form>
			</div>
		</div>
	</div>
	</div>
	<div>
		<%@include file="footer.jsp"%>
	</div>
</body>
</html>