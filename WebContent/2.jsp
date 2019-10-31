<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>数据传递</title>
</head>
<body>
	<!-- EL表达式  -->
	<img src="${pageContext.request.contextPath }${requestScope.imgURL}"></img><br>
	
	<!-- JSTL表达式  -->
	<c:forEach items="${requestScope.messages }" var="message">
		<h2>${message }</h2>
	</c:forEach>
</body>
</html>