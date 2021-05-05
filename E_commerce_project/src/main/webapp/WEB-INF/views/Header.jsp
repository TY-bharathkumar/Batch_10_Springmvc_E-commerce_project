<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String expMsg = (String) request.getAttribute("expMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>

	<table border="1" style="width: 100%; text-align: center;">
		<tr style="background: lightgrey; color: blue; height: 30px">
			<td style="font-size: 20px"><a href="./additem"
				style="text-decoration: none">add</a></td>
			<td style="font-size: 20px"><a href="./removeitem"
				style="text-decoration: none">remove item</a></td>
			<td style="font-size: 20px"><a href="./search"
				style="text-decoration: none">search </a></td>
			<td style="font-size: 20px"><a href="./update"
				style="text-decoration: none">update</a></td>
			<td style="font-size: 20px"><a href="./logout"
				style="text-decoration: none">logout </a></td>
		</tr>

	</table>

	<%
		if (expMsg != null && !expMsg.isEmpty()) {
	%>
	<h1 style="color: blue;">
		<%=expMsg%></h1>
	<%
		}
	%>
</body>
</html>