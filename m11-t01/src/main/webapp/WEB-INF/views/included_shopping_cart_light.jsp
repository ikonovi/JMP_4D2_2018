<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



	<div class=".floatLeft" align="right">
		<table class="tg">
			<caption>
				<spring:message code="USER_GREETING"/>
			</caption>
			<thead>
				<tr>
					<th>
						<a href='<c:url value="/shopping_cart"/>'><spring:message code="SHOPPING_CART_TITLE"/>:</a>
					</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${not empty orderItems}">
						<tr>
							<td>
								<span><i><spring:message code="SHOPPING_CART_ITEMS_COUNT" />: 
								${orderItemsCount}</i></span>
							</td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<td align="center">
								<i><spring:message code="SHOPPING_CART_EMPTY"/></i>
							</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>

