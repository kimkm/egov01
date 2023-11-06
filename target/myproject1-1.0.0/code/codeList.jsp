<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>codeList</title>
</head>
<style>
table{ width:500px; border-collapse: collapse;}
th,td{ border:1px solid #cccccc; padding:5px;}
th{background-color: #ffffca;}
</style>
<body>
<table>
<caption>
<div>코드목록</div><br/>
<div>총: ${resultTotal}개</div>
</caption>
<colgroup>
<col width='10%'>
<col width='10%'>
<col width='20%'>
<col width='35%'>
<col width='25%'>
</colgroup>
<tr>
<th>번호</th>
<th>코드</th>
<th>그룹명</th>
<th>코드명</th>
<th>구분</th>
</tr>
<c:set var="count" value="1"/>
<c:forEach var="result" items="${resultList}" varStatus="status">
<tr align='center'>
<td><c:out value="${count}"/></td>
<td><c:out value="${result.code}"/></td>
<td>${result.gid}</td>
<td>${result.name}</td>
<td>
<input type='button' value='수정' onclick="fn_update(${result.code})"/>
<input type='button' value='삭제' onclick="fn_delete(${result.code})">
</td>
</tr>
<c:set var="count" value="${count+1}" />
</c:forEach>
</table>
<input type='button' value='추가' onclick="location='codeWrite.do'">
<script>
	function fn_delete(code){
		if(confirm("정말삭제할까요?")){
			location="codeDelete.do?code="+code;
		}
	}
	
	function fn_update(code){
		location="codeModifyWrite.do?code="+code;
	}
</script>
</body>
</html>