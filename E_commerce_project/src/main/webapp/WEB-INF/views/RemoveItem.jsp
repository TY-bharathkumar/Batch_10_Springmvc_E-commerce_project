<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
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
		<legend>remove</legend>
		<form action="./removeitem">
			<label>item id: </label> <input type="number" name="userid"
				required="required" placeholder="Enter item user id"> <br>
			<hr>
			<input type="submit" value="Delete">
		</form>
	</fieldset>
</body>
</html>