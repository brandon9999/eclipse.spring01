<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="css/shopping3-1.css">
<html>
<head>
<title>상품 목록 화면</title>
</head>
<body>
<div align="center" class="body">
<h2>상품 목록 화면</h2>
<table border="1">
	<tr class="header">
		<th align="center" width="80">상품ID</th>
		<th align="center" width="320">상품명</th>
		<th align="center" width="100">가격</th>
	</tr>
	<c:forEach items="${itemList}" var="itemaaa">
		<tr class="record">
			<td align="center">${itemaaa.itemId}</td>
			<td align="left">${itemaaa.itemName}</td>
			<td align="right">${itemaaa.price}원</td>
		</tr>
	</c:forEach>
</table>
</div>
</body>
</html>