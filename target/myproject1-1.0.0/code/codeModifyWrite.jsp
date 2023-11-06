<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CodeModify</title></head>
<style>
table{ width:400px; border-collapse: collapse;}
th,td{ border:1px solid #cccccc; padding:5px;}
th{background-color: #ffffca;}
</style>
<body>
<form name='frm' method="post" action="codeModifySave.do">
<input type='hidden' name='code' value="${vo.code}"/>
<table>
<tr><th>분 류</th><td>
<select name='gid'>
<option value='1' <c:if test="${vo.gid=='1'}"> selected </c:if> >job</option>
<option value='2' <c:if test="${vo.gid=='2'}"> selected </c:if> >hobby</option>
</select>
</td></tr>
<tr><th>코드명</th><td><input type='text' name='name' value="${vo.name}"></td></tr>
<tr><td colspan=2 align='center'>
<input type='button' onclick='fn_submit()' value='저장'>
&nbsp; <button type='reset'>취소</button> 
&nbsp; <input type='button' value='목록' onclick="location='codeList.do'"></td></tr>
</table>

</form>
<script type="text/javascript">
function fn_submit(){
	if(document.frm.name.value==""){
		alert("코드명을 입력하세요");
		document.frm.name.focus();
		return false;
	}
	document.frm.submit();
}
</script>

</body>
</html>