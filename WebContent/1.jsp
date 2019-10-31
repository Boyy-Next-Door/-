<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试EL表达式和JSTL表达式</title>
</head>
<body>
	<!-- EL表达式  -->
	<img src="${pageContext.request.contextPath }/img/auleegay.png"></img><br>
	
	<!-- JSTL表达式  -->
	<c:forEach begin="0" end="5" var="i">
		i=${i }<br>
	</c:forEach>
</body>
</html>