<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CodeWrite</title></head>
<style>
table{ width:400px; border-collapse: collapse;}
th,td{ border:1px solid #cccccc; padding:5px;}
</style>
<body>
<form name='frm' method="post" action="codeWriteSave.do">

<table>
<tr><th>분 류</th><td><select name='gid'><option value='1'>job</option><option value='2'>hobby</option></select></td></tr>
<tr><th>코드명</th><td><input type='text' name='name'></td></tr>
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