<%--
  Created by IntelliJ IDEA.
  User: davidstephens
  Date: 7/15/22
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Pizza</title>
</head>
<body>
<form action="pizza-order" method="post">
    <select name="crust" id="crust">
        <option value="garlic-butter">Garlic Butter Crust</option>
        <option value="regular">Regular Crust</option>
        <option value="cheesy">Cheesy Crust</option>
    </select>
    <select name="sauce" id="sauce">
        <option value="marinara">Marinara Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
        <option value="nacho-cheese">Nacho Cheese Sauce</option>
    </select>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>

    <input type="checkbox" id="pepperoni" name="toppings" value="Pepperoni">
    <label for="pepperoni"> Pepperoni</label><br>
    <input type="checkbox" id="sausage" name="toppings" value="Sausage">
    <label for="sausage">Sausage</label><br>
    <input type="checkbox" id="cheese" name="toppings" value="Cheese">
    <label for="cheese">Cheese</label><br>

    <input type="text" name="address">
    <button>Send order</button>

</form>
</body>
</html>
