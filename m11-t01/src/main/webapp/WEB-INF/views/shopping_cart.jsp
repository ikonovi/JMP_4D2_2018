<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>
		<spring:message code="SHOPPING_CART_PAGE_TITLE"/>
	</title>
	<link href="<c:url value="/css/main.css" />" rel="stylesheet" type="text/css">
</head>
<body>

	<div>
		<a href="<c:url value="/"/>"><spring:message code="BOOK_CATALOGUE"/></a>
	</div>
	<hr />
	
	
	<div class="floatLeft"></div>
	
	
	<div class=".floatLeft" align="right">
		<table class="tg">
			<caption>
				<spring:message code="USER_GREETING"/>
			</caption>
			<thead>
				<tr>
					<th colspan="2">
						<spring:message code="SHOPPING_CART_TITLE"/>:
					</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${not empty orderItems}">
						<c:forEach items="${orderItems}" var="orderItem">
							<tr>
								<td>
									<span>
										<strong><spring:message code="STORE_ITEM_ID"/>: </strong>
										${orderItem.storeItem.id}
									</span><br> 
									<span>
										<strong>${orderItem.storeItem.title}</strong>
									</span><br>
									<span>
										<strong><spring:message code="STORE_ITEM_BOOK_AUTHOR"/>: </strong>
										${orderItem.storeItem.author}
									</span><br> 
									<span>
										<strong><spring:message code="STORE_ITEM_PRICE"/>: </strong>
										${orderItem.storeItem.price}
									</span><br>
									<form action="<c:url value='/shopping_cart/book/${orderItem.storeItem.id}/updateQty'/>">
										<label for="qty">
											<strong><spring:message code="QUANTITY"/>: </strong>
										</label>
										<input type="number" id="qty" name="qty" min="1" max="25" maxlength="3" value="${orderItem.quantity}">
										<input type="submit" value="<spring:message code='BUTTON_ITEM_UPDATE_QTY'/>">
									</form>
								</td>
								<td>
									<div>
										<a href="<c:url value='/shopping_cart/book/${orderItem.storeItem.id}/remove'/>">
											<spring:message code="BUTTON_ITEM_REMOVE"/>
										</a>
									</div>
								</td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td align="center" colspan="2">
								<i><spring:message code="SHOPPING_CART_EMPTY"/></i>
							</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
			<tfoot align="left">
				<tr>
					<th colspan="2">
						<spring:message code="SHOPPING_CART_TOTAL"/>: ${totalPrice}
					</th>
				</tr>
			</tfoot>
		</table>
	</div>


</body>
</html>