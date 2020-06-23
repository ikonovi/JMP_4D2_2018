<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>
		<spring:message code="BOOK_CATALOGUE"/>
	</title>
	<link href="<c:url value="/css/main.css" />" rel="stylesheet" type="text/css">
</head>

<body>

	<div class="floatLeft">
		<table class="tg">
			<caption>
				<spring:message code="STORE_TITLE"/>
			</caption>
			<thead>
				<tr>
					<th width="80">
						<spring:message code="STORE_ITEM_ID"/>
					</th>
					<th colspan="2" />
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty books}">
					<c:forEach items="${books}" var="book">

						<c:url var="openBookById" value='/bookDetail/${book.id}' />

						<tr>
							<td>${book.id}</td>
							<td>
								<p>
									<span><strong>${book.title}</strong></span>
								</p>
								<p>
									<span><strong><spring:message code="STORE_ITEM_BOOK_AUTHOR" />:</strong>
										${book.author}</span>
								</p>
								<p>
									<spring:message code="STORE_ITEM_PRICE"/> ${book.price}
								</p>
								<p>
									<a href="${openBookById}"><spring:message code="STORE_ITEM_SEE_DETAILS"/></a>
								</p>
							</td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>


	<jsp:include page="included_shopping_cart_light.jsp" />


</body>
</html>

