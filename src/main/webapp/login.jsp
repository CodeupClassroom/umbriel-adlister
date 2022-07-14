<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 7/14/22
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getParameter("username") != null || request.getParameter("password") != null) {
        if(request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>
<html>
<head>
    <title>Login</title>
    <%@ include file="partials/head.jsp"%>
</head>
<body>
<%@ include file="partials/navbar.jsp"%>
<form action="login.jsp" method="POST">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username">
    <label for="password">Password: </label>
    <input type="password" name="password" id="password">
    <button type="submit">Submit</button>
</form>
<%--<c:if test='${param.username != null && param.password != null}'>--%>
<%--    <c:choose>--%>
<%--        <c:when test="${param.username.equals(\"admin\") && param.password.equals(\"password\")}">--%>
<%--            <% response.sendRedirect("/profile.jsp"); %>--%>
<%--        </c:when>--%>
<%--        <c:otherwise>--%>
<%--            <% response.sendRedirect("/login.jsp"); %>--%>
<%--        </c:otherwise>--%>
<%--    </c:choose>--%>
<%--</c:if>--%>
</body>
</html>
