<%@page import="web_gradle_erp.ds.jndiDS"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
하이!@
<%=jndiDS.getConnection() %>
</body>
</html>
