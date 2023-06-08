<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.bao.MemberDao" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberDao memdao = MemberDao.getInstance();
		Connection conn =memdao.getConnection();
		out.print("성공");
	%>
</body>
</html>