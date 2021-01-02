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
		<title>Edit Key</title>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-6">
				<br><br><br>
				<center><h1>Edit Key</h1></center>
					<form action="updateKey" method="post">
						<div class="form-group">
							ID Key: <input type="text" class="form-control" name="idkey" value="${key.idkey}" required>
						</div>
						<div class="form-group">
							app type : <input type="text" class="form-control" name="appType" value="${key.appType}" required>
						</div>
						<div class="form-group">
							app type : <input type="text" class="form-control" name="appType" value="${key.appType}" required>
						</div>
						<div class="form-group">
							app name : <input type="text" class="form-control" name="appName" value="${key.appName}" required>
						</div>
						<div class="form-group">
							app key: <input type="text" class="form-control" name="Ackey" value="${key.ackey}" required>
						</div>
						<div class="form-group">
							max users : <input type="text" class="form-control" name="maxUsers"  value="${key.maxUsers}" required>
						</div>
						<div class="form-group">
							activation days: <input type="text" class="form-control" name="activationDays" value="${key.activationDays}" required>
						</div>
						<div class="form-group">
							date création : <input type="date"  class="form-control" name="date" value="${formatDate}" required>
						</div>
						<div class="form-group">
							<input class="btn btn-primary" type="submit" value="edit">
						</div>
						
						
					</form>
					<br/>
					<br/>
					<a href="KeysList">List Keys</a>
				</div>
				<div class="col-sm-3"></div>
			</div>
		</div>
	</body>
</html>