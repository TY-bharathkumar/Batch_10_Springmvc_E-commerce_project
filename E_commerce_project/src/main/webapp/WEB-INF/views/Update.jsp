<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Integer id = (Integer) request.getAttribute("id");
	String msg = (String) request.getAttribute("msg");
%>
<%@ include file="Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h1>
		<%=msg%></h1>
	<%
		}
	%>
	<fieldset>
		<legend>Add Item</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>user id</td>
					<td>:</td>
					<td><%=id%></td>
					<td><input type="number" name="userid" value="<%= id %>"
						placeholder="Enter the ID"  hidden="true"></td>
				</tr>
				<tr>
					<td>item price</td>
					<td>:</td>
					<td><input type="number" name="price"
						placeholder="Enter the price"></td>
				</tr>
				<tr>
					<td>Item quantity</td>
					<td>:</td>
					<td><input type="number" name="quantity"
						placeholder="Enter the item quantity"></td>
				</tr>
				<tr>
					<td>user Password</td>
					<td>:</td>
					<td><input type="password" name="password"
						placeholder="Enter the password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="update"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>