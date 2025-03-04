<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% request.setCharacterEncoding("utf-8"); %>
<html>
<head>
<meta charset="UTF-8">
<title>shopping</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<body>
	<jsp:include page="menu.jsp"/>
	<%
		String greeting = "쇼핑몰에 오신걸 환영합니다.";
		String tagline = "Welcome";
	%>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class ="display-3"><%=greeting %></h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3><%=tagline %></h3>
			<%
				//웹사이트에 리프레쉬 기능 추가
				response.setIntHeader("Refresh", 5);
				//접속시간 표시
				Calendar calendar = Calendar.getInstance();
				int hour = calendar.get(calendar.HOUR_OF_DAY);
				int minute = calendar.get(calendar.MINUTE);
				int second = calendar.get(calendar.SECOND);
				int am_pm = calendar.get(calendar.AM_PM);
				String ampm = null;
				if(am_pm == 0){
					ampm = "오전";
				}else{
					ampm = "오후";
				}
				String connectTime = hour + ":" + minute + ":" + second + " " + ampm;
				out.println("현재 접속 시간: " + connectTime + "\n");
				
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp"/>


</body>
</html>