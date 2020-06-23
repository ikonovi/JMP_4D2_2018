<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="BOOK_DETAIL"/></title>
<link href="<c:url value="/css/main.css" />" rel="stylesheet" type="text/css">
</head>
<body>


	<div>
		<a href="<c:url value="/"/>"><spring:message code="BOOK_CATALOGUE"/></a>
	</div>
	<hr />


	<div class="floatLeft">
		<h3>${book.title}</h3>
		<p>
			<strong><spring:message code="AUTHOR"/>:</strong> ${book.author}
		</p>
		<p>
			<strong><spring:message code="DESCRIPTION"/>:</strong> ${book.description}
		</p>
	
		<hr>
		<p>
			<spring:message code="PRICE"/>: ${book.price}
		</p>
			
		<div>
			<c:url var="addToCart" value='/bookDetail/${book.id}/AddToCart' />
			<form action="${addToCart}" method="get">
				<label for="qty"><spring:message code="QUANTITY"/></label>
				<input type="number" id="qty" name="qty" min="1" max="25" maxlength="3" value="1">
				<input type="submit" value='<spring:message code="ADD_TO_CART"/>'>
			</form>
		</div>
		
		<div>
			<c:if test="${not empty inCart}">
				<p><i><spring:message code="BOOK_ADDED_TO_CART"/></i></p>
			</c:if>
		</div>
	</div>
	
	
	<jsp:include page="included_shopping_cart_light.jsp" />
	
	
</body>
</html>