<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model and View Eg to send data from controller to view</title>
</head>
<body>


	<%
	String name = (String) request.getAttribute("name");
	Integer rollno = (Integer) request.getAttribute("rollnum");
	%>
	<h1>my name
		<%=name%></h1>

	<h1>rollnum is
		<%=rollno%></h1>
</body>
</html>