<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"/>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class ="display-3">상품 등록</h1>
		</div>
	</div>

	<div class="container">
		<form name="newProduct" action="./processAddProduct.jsp" class="form-horizontal" method="post">
		
		<div class="form-group row ">
			<label class ="col-sm-2"><b>상품 코드</b></label>
			<div class="col-sm-3">
			<input type="text" name="productId" class="form-control" placeholder="상품코드를 입력하세요.">
			</div>
		</div>
		
		<div class="form-group row ">
			<label class ="col-sm-2"><b>상품명</b></label>
			<div class="col-sm-3">
			<input type="text" name="name" class="form-control" placeholder="상품명을 입력하세요.">
			</div>
		</div>
			<div class="form-group row ">
			<label class ="col-sm-2"><b>가격</b></label>
			<div class="col-sm-3">
			<input type="text" name="unitPrice" class="form-control" placeholder="가격을 입력하세요.">
			</div>
		</div>
			<div class="form-group row ">
			<label class ="col-sm-2"><b>상세 정보</b></label>
			<div class="col-sm-5">
				<textarea name="discription" cols="50" rows="2" class="form-control" placeholder="상세정보를 입력하세요."></textarea>
			</div>
		</div>
			<div class="form-group row ">
			<label class ="col-sm-2"><b>제조사</b></label>
			<div class="col-sm-3">
			<input type="text" name="manufacturer" class="form-control" placeholder="제조사를 입력하세요.">
			</div>
		</div>
			<div class="form-group row ">
			<label class ="col-sm-2"><b>분류</b></label>
			<div class="col-sm-3">
			<input type="text" name="category" class="form-control" placeholder="분류를 입력하세요.">
			</div>
		</div>
			<div class="form-group row ">
			<label class ="col-sm-2"><b>재고수</b></label>
			<div class="col-sm-3">
			<input type="text" name="unitsInStock" class="form-control" placeholder="재고수를 입력하세요.">
			</div>
		</div>
			<div class="form-group row ">
			<label class ="col-sm-2"><b>상태</b></label>
			<div class="col-sm-5">
			<input type="radio" name="condition" value="New">신규 제품
			<input type="radio" name="condition" value="Old">중고 제품
			<input type="radio" name="condition" value="Refurblished">재생 제품
			</div>
		</div>
			<div class="form-group row ">
			<div class="col-sm-offset-2 col-sm-10">
			<input type="submit" class="btn btn-primary" value="등록">
			</div>
		</div>
			
		</form>
	</div>
</body>
</html>