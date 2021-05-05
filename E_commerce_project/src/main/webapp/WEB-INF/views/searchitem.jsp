<%@page import="com.te.springmvc.bean.ItemsBean"%>
<%@page import="java.util.List"%>
<%@page import="com.te.springmvc.bean.ItemsBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	ItemsBean itembaen = (ItemsBean) request.getAttribute("data");
	String msg = (String) request.getAttribute("msg");
	List<ItemsBean> infoBeans = (List) request.getAttribute("itembaen");
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
		<legend>Search</legend>
		<form action="./searchitem" method="get">
			<table>
				<tr>
					<td>item user id</td>
					<td>:</td>
					<td><input type="number" name="id"
						placeholder="Enter the userid"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
		if (itembaen != null) {
	%>
	<h1>
		userid :
		<%=itembaen.getUserid()%></h1>
	<h1>
		price :
		<%=itembaen.getPrice()%></h1>
	<h1>
		quantity :
		<%=itembaen.getQuantity()%></h1>
	<%
		}
	%>

	<%
		if (itembaen != null) {
	%>
	<table>
		<tr>
			<th>userid</th>
			<th>price</th>
			<th>quantity</th>
		</tr>
		<%
			for (ItemsBean bean : itembaen) {
		%>
		<tr>
			<td><%=itembaen.getUserid()%></td>
			<td><%=itembaen.getPrice()%></td>
			<td><%=itembaen.getQuantity()%></td>
		</tr>

	</table>

	<%
		}
		}
	%>











</body>
</html>