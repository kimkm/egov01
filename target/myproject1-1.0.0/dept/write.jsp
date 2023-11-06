<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name='frm' method="post" action="deptWriteSave.do">
<table>
<tr><td>부서명</td><td><input type='text' name="deptno"</td></tr>
<tr><td>부서이름</td><td><input type='text' name="dname"</td></tr>
<tr><td>부서위치</td><td><input type='text' name="loc"</td></tr>
<tr><td colspan="2"><input type="submit" value="저장"></td></tr>
</table>
</form> 
</body> 
</html>