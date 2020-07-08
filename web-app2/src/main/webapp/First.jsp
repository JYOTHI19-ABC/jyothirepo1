<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "Welcome To Jsp" %>
<%=18 %>
<% String name ="jyothi H m " ;%>
<%=name %>

<%=18 + 100 %> <br/>
 <% String name1 ="jyothi"; %>
 <%=name1 %>
 
 
 <%
 	out.println("Name is " + name);
 	out.println(name.toUpperCase()); 	
 %>
 
 <%
 	for(int i  = 0; i<10; i++){ 		
 		out.println("<br/>" + i);
 	}
 
 %>
  <%-- Declaration --%>
  <%!
 int age = 20; 
 public int displayAge(){	
	 return age;
 }
 %>
 
 <H2>
 Age is <%=displayAge() %>
 </H2>

</body>
</html>