<%@page import="dto.Product"%>
<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	request.setCharacterEncoding("utf-8");

	//addProduct.jsp에서 사용자가 입력한 부분을 받아서 저장을 하고 있다.
 	String productId = request.getParameter("productId");
 	String name = request.getParameter("name");
 	String unitPrice = request.getParameter("price");
 	String description = request.getParameter("description");
 	String manufacturer = request.getParameter("manufacturer");
 	String category = request.getParameter("category");
 	String unitsInStock = request.getParameter("unitsInStock");
 	String condition = request.getParameter("condition");

 	Integer price;
 	long stock;
 	
 	//단가(unitPrice)입력창에 미 입력시에
	if(unitPrice.isEmpty()){
		price = 0; //자동 박싱이 일어난다.
	}
	else{
		//String을 숫자로 변환
		price = Integer.valueOf(unitPrice);
	}
 	
 	// 재고 수량(unitsInStock)을 long으로 변환
 	if(unitsInStock.isEmpty()){
 		stock = 0;
 	}
 	else{
 		//string을 long타입으로 변환
 		stock = Long.valueOf(unitsInStock);  // String -> long으로 변환
 	}

 	// ProductRepository 싱글톤 객체 가져오기
 	ProductRepository dao = ProductRepository.getInstance();
 	Product newProduct = new Product();
 		
 	newProduct.setProductId(productId);
 	newProduct.setPname(name);
 	newProduct.setUnitPrice(price);
 	newProduct.setDescription(description);
 	newProduct.setManufacturer(manufacturer);
 	newProduct.setCategory(category);
 	newProduct.setUnitsInStock(stock);  // 여기서 long 타입을 전달
 	newProduct.setCondition(condition);
 		
 	// 상품 추가
 	dao.addProduct(newProduct);
 	//강제로 페이지 이동
 	response.sendRedirect("product.jsp");
%>