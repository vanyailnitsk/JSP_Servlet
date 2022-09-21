<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 21.09.2022
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="service.Cart" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
     <% Cart cart = (Cart) session.getAttribute("cart");%>
    <p>Наименование:<%= cart.getName()%></p>
     <p>Количество:<%= cart.getQuantity()%></p>
</body>
</html>
