<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<h2>회원 가입</h2>
	'*" 표시항목 필수 입력 항목입니다.
	<form action="join.do" method="post" name="frm">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="userid" size="20" id="userid">
					<input type="hidden" name="reid" size="20">
					<input type="button" value="중복체크" onclick="idCheck()">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pwd" size="20">*</td>
			</tr>
			<tr>
				<td>암호확인</td>
				<td><input type="password" name="pwd_check" size="20">*</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="email" size="20">*</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="phone" size="20">*</td>
			</tr>
			<tr>
				<td>등급</td>
				<td>
							<input type="radio" name="admin" value="0" checked="checked">일반회원
							<input type="radio" name="admin" value="1">관리자
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="확인" onclick="return joinCheck()">&nbsp;&nbsp;
					<input type="reset" value="취소">
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>

