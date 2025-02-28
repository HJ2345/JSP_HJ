<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% %> <!-- 스크립트릿 이라고 한다. JSP파일에서 자바코드를 삽입할때 반드시 표기해야 하는 문자 -->

<%
	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(calendar.HOUR_OF_DAY);
	int minute = calendar.get(calendar.MINUTE);
	int second = calendar.get(calendar.SECOND);
%>

</head>
<body>
<%-- <%= %> 스크립트릿의 일종으로 표현식(expression)이다.
단,값을 나타내고자 할 때, 사용을 한다. ;을 붙이지 않는다.--%>
	<h1>현재 시간 : <%=hour %>시 <%=minute %>분 <%=second %>초</h1>


</body>
</html>