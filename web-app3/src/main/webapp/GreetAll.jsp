<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%String name = request.getParameter("USERNAME"); 
 String collage= request.getParameter("COLLAGENAME");
 String info=(String)request.getAttribute("info");%>
<%="welcome to greeting page" %>
<%=info %>
<%=name %>
<%=collage %>
</body>
</html>