<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome page</title>
</head>
<body>
	<h1>hello welcome home page</h1>
	<h1>model example to send data from controller to view</h1>

	<%
	String name = (String) request.getAttribute("name"); 
	Integer id = (Integer) request.getAttribute("id"); 
	 List<String> friends= (List<String>) request.getAttribute("f"); 
	 %>


	<h3>name is
		<%=name%></h3>
	<h3>Id is
		<%=id%></h3>

	<% for (String s : friends) { %>

	<li><%= s %></li>

	<% }%>

</body>
</html>