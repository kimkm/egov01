<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr><td>부서명</td><td>${deptVO.deptno}</td></tr>
<tr><td>부서이름</td><td>${deptVO.dname}</td></tr>
<tr><td>부서위치</td><td>${deptVO.loc}</td></tr>
<tr><td colspan="2">
<input type="button" value="목록" onclick="location='deptList.do'"> 
<input type="button" value="수정" onclick="location='deptModifyWrite.do?deptno=${deptVO.deptno}'">
<input type="button" value="삭제" onclick="location='deptDelete.do?deptno=${deptVO.deptno}'"> 
</td></tr>
</table>

</body> 
</html>