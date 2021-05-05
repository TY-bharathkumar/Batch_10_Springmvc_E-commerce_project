<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String msg = (String) request.getAttribute("msg");
String errMsg = (String) request.getAttribute("errMsg");
%>
<jsp:include page="Header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
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
	<%
		if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h1 style="color: red;">
		<%=errMsg%></h1>
	<%
		}
	%>
	<fieldset>
		<legend>Add Item</legend>
		<form action="./additem" method="post">
			<table>
				<tr>
					<td>item id</td>
					<td>:</td>
					<td><input type="number" name="userid"
						placeholder="Enter the ID" required="required"></td>
				</tr>
				<tr>
					<td>item price</td>
					<td>:</td>
					<td><input type="number" name="price"
						placeholder="Enter the price" required="required"></td>
				</tr>
				<tr>
					<td>item quantity</td>
					<td>:</td>
					<td><input type="number" name="quantity"
						placeholder="Enter the quantity" required="required"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Add"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>