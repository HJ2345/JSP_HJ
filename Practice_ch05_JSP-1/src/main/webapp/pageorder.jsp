<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date date = new Date();
	%>
	
	<h1><%= date %></h1>
</body>
</html>