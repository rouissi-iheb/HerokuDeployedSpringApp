<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<head>
		<meta charset="windows-1256">
		<title>Add Key</title>
	</head>
	<body>
		<div class="container">
			<div class="row">
			<div class="col-sm-4"></div>
				<div class="col-sm-4">
				<center><h1>Add new Activation key ! </h1></center>
					<div class="card-body">
						<form action="SaveKey" method="post">
								<div class="form-group">
									<label class="control-label">app type : </label>
									<input type="text" class="form-control" name="appType" required>
								</div>
								
								<div class="form-group">
									<label class="control-label">app name : </label>
									<input type="text" class="form-control" name="appName" required>
								</div>						
								
								<div class="form-group">
									<label class="control-label">app key: </label>
									<input type="text" class="form-control" name="Ackey" required>
								</div>
								
								<div class="form-group">
									<label class="control-label">max users : </label>
									<input type="text" class="form-control" name="maxUsers" required>
								</div>
								
								<div class="form-group">
									<label class="control-label">activation days: </label>
									<input type="text" class="form-control" name="activationDays" required>
								</div>
								
								<div class="form-group">
									<label class="control-label">date création : </label>
									<input type="date" class="form-control" name="date" required>
								</div>
								<div class="form-group">
									<input type="submit" class="btn btn-primary" value="Add Serial Key">
								</div>
						</form>
						${msg}
						<br/>
						<br/>
						<a href="KeysList">List Keys</a>
					</div>
				</div>
				<div class="col-sm-4"></div>
			</div>
		</div>
	</body>
</html>