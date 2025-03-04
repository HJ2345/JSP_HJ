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
<title>상품목록</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<body>
	<jsp:include page="menu.jsp"/>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class ="display-3">상품목록</h1>
		</div>
	</div>
	<%
		ProductRepository dao = ProductRepository.getInstance();
	
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>
	<div class="container">
		<div class="row" align="center">
		<%
			for(int i=0; i<listOfProducts.size(); i++){
				Product product = listOfProducts.get(i);
				
			
		%>
		<div class="col-md-4">
			<h3><%= product.getPname()%></h3>
			<p><%= product.getDescription()%></p>		
			<p><%= product.getUnitPrice()%>원</p>	
			
			<!-- 상품의 아이디에 대한 상세정보 페이지를 연결시키기 위해서 아래코드를 작성하였다. -->
			<p><a href = "./product.jsp?id=<%=product.getProductId()%>" 
			 class = "btn btn-secondary" role="button">상세 정보 &raquo;></a></p>	
		</div>
		<%
			}
		%>
		</div>
		<hr>
	</div>
	
	<jsp:include page="footer.jsp"/>


</body>
</html>