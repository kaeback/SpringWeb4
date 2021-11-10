<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 쓰기</title>
<link href="./resources/web4.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>[ 방명록 쓰기 ]</h1>

<form action="write" method="post">
<table>
	<tr>
		<th>이름</th>
		<td><input type="text" name="name" id="name" maxlegth="10" required="required"></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type="password" name="password" id="password" maxlegth="10" required="required"></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea name="content" id="content", required="required"></textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="저장">
	</tr>
</table>
</form>
</body>
</html>