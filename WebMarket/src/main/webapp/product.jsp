<%@page import="dao.ProductRepository"%>
<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"></jsp:useBean> --%>
<!DOCTYPE html>
<% request.setCharacterEncoding("utf-8"); %>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<body>
<jsp:include page="menu.jsp"/>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class ="display-3">상품 정보</h1>
		</div>
	</div>
	<%
		ProductRepository dao = ProductRepository.getInstance();
		//넘어온 상품 아이디값을 얻어낸다.
		String id = request.getParameter("id");
		//넘어온 상품 아이디값을 이용해서 실제 해달하는 Product객체를 얻고 있다.
		Product product = dao.getProductById(id);
	
	%>
	<div class="container">
		<div class="row">
			<div class ="col-md-6">
				<h3><%= product.getPname() %></h3>
				<p><%= product.getDescription() %></p>
				<p><b>상품코드 : </b><span class="badge badge-danger"><%= product.getProductId()%></span></p>
				<p><b>제조사 : </b><%= product.getManufacturer() %></p>
				<p><b>분류 : </b><%= product.getCategory() %></p>
				<p><b>재고 수 : </b><%= product.getUnitsInStock() %></p>
				<h4><%= product.getUnitPrice() %>원</h4>
				
				<p><a href="#" class="btn btn-info">상품 주문 &raquo;</a>
				<a href="./products.jsp" class="btn btn-secondary">상품 목록 &raquo;</a>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>