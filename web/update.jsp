<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function reset1(){
		var a = document.getElementByName('xiaoQu')[0];
		var b = document.getElementByName('huXing')[0];
		var c = document.getElementByName('zuJin')[0];
		var d = document.getElementByName('dianHua')[0];
		var e = document.getElementByName('diZhi')[0];
		
		a.value="";
		b.value="";
		c.value="";
		d.value="";
		e.value="";
		
	}
</script>
</head>
<body>
<%
	int id=Integer.parseInt(request.getParameter("id"));
%>
	<h1 align="center">修改出租房屋信息</h1>
	<form action="${pageContext.request.contextPath}/UpdateServlet" method="post">
		<table>
			<tr>
				<td>小区名称：</td>
				<td><input name="xiaoQu" required></td>
			</tr>
			<tr>
				<td>户型:</td>
				<td><input name="huXing" required></td>
			</tr>
			<tr>
				<td>租金：</td>
				<td><input name="zuJin" required></td>
			</tr>
			<tr>
				<td>联系电话：</td>
				<td><input name="dianHua" required></td>
			</tr>
			<tr>
				<td>小区地址：</td>
				<td><input name="diZhi" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="修改"></td>
				<td><input type="reset" value="重置" onclick="reset1()"></td>
			</tr>
		</table>
		<input name="ids" value="<%=id%>" style="display:none;">
	</form>
</body>
</html>
