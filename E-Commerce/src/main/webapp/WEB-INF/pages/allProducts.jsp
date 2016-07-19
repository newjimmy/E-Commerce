<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>E-Commerce. All products table</title>
    <script src="resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
    <script src="resources/custom/js/allProductsJS.js" type="application/javascript"></script>
</head>
<body>
Welcome to the products page.
<br/>
<br/>
<br/>
<table id="Products table" class="table table-bordered" border="1">
    <thead>
    <tr>
        <th>&nbsp; Area (square metres) &nbsp;</th>
        <th>&nbsp; Price ($) &nbsp;</th>
        <th>&nbsp; Year  (building year) &nbsp;</th>
        <th>&nbsp; Rooms number &nbsp;</th>
        <th>&nbsp; Location &nbsp;</th>
    </tr>
    </thead>
    <tbody id="allProductsTable" align="center">
    </tbody>
</table>
</body>
</html>