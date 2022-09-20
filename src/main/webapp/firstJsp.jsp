<%--
  Created by IntelliJ IDEA.
  User: vanya
  Date: 19.09.2022
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>
        <%
            for (int i = 0; i < 10; i++) {
                out.println(i);
            }
        %>
    </h1>
</body>
</html>
