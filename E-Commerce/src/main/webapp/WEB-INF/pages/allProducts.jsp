<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>All products table</title>
    <script src="resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
    <script src="resources/custom/js/allProductsJS.js" type="application/javascript"></script>
    <script src="resources/vendor/js/bootstrap.min.js"></script>
    <link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<br/>
<h3>&emsp; Welcome to the products page</h3>
<br/>
<br/>
<div class="row">
    <div class="col-md-6 col-md-offset-1">
        <p class="lead">Table of the products</p>
        <table id="Products table" class="table table-bordered table-striped">
            <thead>
            <tr>
                <th class="text-center" abbr title="square metres">Area</th>
                <th class="text-center" abbr title="price in USD">Price</th>
                <th class="text-center" abbr title="building year">Year</th>
                <th class="text-center" abbr title="rooms number">Rooms</th>
                <th class="text-center" abbr title="location relative to the city center">Location</th>
            </tr>
            </thead>
            <tbody id="allProductsTable" align="center">
            </tbody>
        </table>
    </div>
</div>
<br/>
<br/>
<br/>
<div class="col-sm-6">
    <h6><a href="<c:url value="/logout" />">Logout</a></h6>
</div>
</body>

</html>