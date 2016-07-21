<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All categories table</title>
    <script src="resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
    <script src="resources/custom/js/allCategoriesByIdJS.js" type="application/javascript"></script>
    <script src="resources/vendor/js/bootstrap.min.js"></script>
    <link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<br/>
<h3>&emsp; Welcome to the categories page</h3>
<br/>
<br/>
<div class="row">
    <div class="col-sm-1 col-md-offset-1">
        <table id="Categories table"  class="table table-hover">
            <thead>
            <tr>
                <th class="text-center" abbr title="Please, select a city">Cities</th>
            </tr>
            </thead>
            <tbody id="categoriesTableBody" align="center">
            </tbody>
        </table>
    </div>
</div>
<br/>
<br/>
<br/>
<div class="row">
    <div class="col-sm-6">
        <table id="Products by category ID" class="table table-striped table-condensed table-bordered">
            <p class="lead">Products by selected category</p>
            <thead>
            <tr>
                <th class="text-center" abbr title="square metres">Area</th>
                <th class="text-center" abbr title="price in USD">Price</th>
                <th class="text-center" abbr title="building year">Year</th>
                <th class="text-center" abbr title="rooms number">Rooms</th>
                <th class="text-center" abbr title="location relative to the city center">Location</th>
            </tr>
            </thead>
            <tbody id="productsByCategoryId" align="center"></tbody>
        </table>
    </div>
</div>
</body>
</html>