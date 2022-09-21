<%--
  Created by IntelliJ IDEA.
  User: vanya
  Date: 19.09.2022
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="service.DataBase" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <jsp:include page="" />
    <% String login = request.getParameter("login");
        String password = request.getParameter("password");
        String status;
        DataBase db = new DataBase();
        if (db.checkCorrectLogin(login,password)) {
            status = "Successful authorization";
        }
        else {
            status = "Incorrect login or password";
        }
    %>
    <h2>
       <%= status%>
    </h2>
</body>
</html>
