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
<table border='1' width='400'>
<caption>부서목록</caption>
<tr><th>번호</th><th>이름</th><th>위치</th></tr>

<c:forEach var="result" items="${resultList}" varStatus="status">
<tr>
<td><c:out value="${result.deptno}"/></td>
<td><a href="deptDetail.do?deptno=${result.deptno}">${result.dname}</a></td>
<td><c:out value="${result.loc}"/></td>
</tr>
</c:forEach>

</table>
<input type="button" value="추가" onclick="location='deptWrite.do'">
</body>
</html>