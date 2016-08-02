<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <title>All categories table</title>
    <script src="resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
    <script src="resources/custom/js/allCategoriesJS.js" type="application/javascript"></script>
    <script src="resources/vendor/js/bootstrap.min.js"></script>
    <link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<br/>
<h3>&emsp; Welcome to the categories page</h3>
<br/>
<br/>
<div class="row">
    <div class="col-sm-2 col-md-offset-1">
        <p class="lead">Table of the categories</p>
        <table id="Categories table" class="table table-bordered table-striped">
            <thead>
            <tr>
                <th class="text-center" abbr title="A list of cities">Cities</th>
            </tr>
            </thead>
            <tbody id="allCategoriesTable" align="center">
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