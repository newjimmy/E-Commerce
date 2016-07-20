<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>E-Commerce. All categories table</title>
    <script src="resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
    <script src="resources/custom/js/allCategoriesByIdJS.js" type="application/javascript"></script>
</head>
<body>
Welcome to the categories page. Please, select a category.
<br/>
<br/>
<br/>
<table id="Categories table" class="table table-bordered" border="1">
    <thead>
    <tr>
        <th>&nbsp; Cities &nbsp;</th>
    </tr>
    </thead>
    <tbody id="categoriesTableBody" align="center">
    </tbody>
</table>
<br/>
<br/>
<br/>
<table id="Products by category ID" border="2">
    <thead>
    <tr>
        <th>&nbsp; Area (square metres) &nbsp;</th>
        <th>&nbsp; Price ($) &nbsp;</th>
        <th>&nbsp; Year  (building year) &nbsp;</th>
        <th>&nbsp; Rooms number &nbsp;</th>
        <th>&nbsp; Location &nbsp;</th>
    </tr>
    </thead>
    <tbody id="productsByCategoryId" align="center"></tbody>
</table>
</body>
</html>