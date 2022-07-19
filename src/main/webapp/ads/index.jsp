<%--
  Created by IntelliJ IDEA.
  User: davidstephens
  Date: 7/19/22
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Ads</title>
</head>
<body>
  <h1>Howdy${username}. Here are all the ads.</h1>
  <c:forEach var="ad" items="${ads}">
    <div class="ad">
      <h2>${ad.title}</h2>
      <p>${ad.description}</p>
    </div>
  </c:forEach>
</body>
</html>
