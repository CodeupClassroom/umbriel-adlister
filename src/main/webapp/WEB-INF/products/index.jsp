<%--
  Created by IntelliJ IDEA.
  User: davidstephens
  Date: 7/18/22
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products Page</title>
</head>
<body>
    <h1>Viewing All Products</h1>
    <c:forEach var="product" items="${products}">
        <h2>${product.name}</h2>
        <p>Price $${product.price}</p>
    </c:forEach>
</body>
</html>
