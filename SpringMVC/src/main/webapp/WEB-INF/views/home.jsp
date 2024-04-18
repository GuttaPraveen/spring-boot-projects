<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--
	   <%
			String username=request.getParameter("username");
			String psw=request.getParameter("psw");
			out.println(username);
			out.println(psw);
		%>
	--%>
	<p>User Name is: ${username}</p>
	<p>Password  is: ${psw}</p>

</body>
</html>