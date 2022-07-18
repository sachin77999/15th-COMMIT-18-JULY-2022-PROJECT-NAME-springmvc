<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date,java.io.*,java.util.Enumeration"%>
    
    
    <%@page isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

<%

/* String name=(String)request.getAttribute("name");
Integer rollnumber=(Integer)request.getAttribute("rollnumber"); */


%>


<%-- <h1>My name is <%= name %></h1>
<h1>This is help page</h1>
<h1>My rollnumber is <%=rollnumber %> </h1> --%>

<h1>Hello My name is 
${name}
</h1>

<h1>This is help page</h1>

<h1>my rollnumber is 
${rollnumber}
</h1>
<hr>

 ${marks} 

<%-- <c:forEach 
var="item" items="${marks }">
<h1>${item }</h1>

</c:forEach> --%>


</body>
</html>