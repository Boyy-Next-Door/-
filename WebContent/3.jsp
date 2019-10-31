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
	<form action="${pageContext.request.contextPath }/auLeeGay">
		<input type="text" name="username" placeholder="请输入用户名">
		<input type="submit">
	</form>
</body>
</html>