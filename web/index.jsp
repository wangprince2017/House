<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<form action="${pageContext.request.contextPath}/IndexServlet2" method="post">
		小区名称：<input name="xiaoQuName" value="${name}">
		户型：<select name="huXing">
				<option value="一室一厅">一室一厅</option>
				<option value="一室一卫">一室一卫</option>
				<option value="三室两卫">三室两卫</option>
				<option value="两室两卫">两室两厅</option>
				<option value="三室一厅">三室一厅</option>
				<option value="">所有</option>
			</select>
		
			<input type="submit" value="查询">
	</form>
	</div>
	
	<table align="center" border="1">
		<tr bgcolor="white">
			<th>ID</th>
			<th>小区名城</th>
			<th>小区户型</th>
			<th>租金(元/月)</th>
			<th>联系电话</th>
			<th>小区地址</th>
			<th>操作</th>
		</tr>
		<c:forEach var="xiaoQu" items="${list}">
			<tr>
				<td align="center">${xiaoQu.letId }</td>
				<td align="center">${xiaoQu.letName }</td>
				<td align="center">${xiaoQu.letType }</td>
				<td align="center">${xiaoQu.letPrice }</td>
				<td align="center">${xiaoQu.letPhone }</td>
				<td align="center">${xiaoQu.letAddress }</td>
				<td align="center"><a href="update.jsp?id=${xiaoQu.letId}">修改</a> <a href="DeleteServlet?id1=${xiaoQu.letId}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
