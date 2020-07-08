<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.model.Book,com.demo.model.Member" %>
  --%>
 <%@ page import="com.demo.model.Book" %>
 <%@ page import="com.demo.model.Member" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
	
	<%!
	Book book = new Book();	
	%>
	
	<%
	
		book.setTitle("Learn Java in 24 hours");		
	%>
	
	<%=book.getTitle() %>
	
	
	
	<% int i = 20; %>

	<%! int i = 200; %>

	<%=i %>
	
	

</body>
</html>