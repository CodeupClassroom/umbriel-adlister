<%--
  Created by IntelliJ IDEA.
  User: davidstephens
  Date: 7/18/22
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick A Color</title>
</head>
<body>
<form action="pickcolor" method="POST">
    <label for="color">Pick a color:</label>
    <input type="text" name="color" id="color">
    <button>Color Picked</button>
</form>
</body>
</html>
