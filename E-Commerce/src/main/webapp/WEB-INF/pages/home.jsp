<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <title>Home page</title>
    <script src="resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
    <script src="resources/vendor/js/bootstrap.min.js"></script>
    <link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<h3>&emsp;Hello</h3>
<h4>&emsp;This is a home page</h4>
<div class="col-sm-6">
    <h5><a href="allproducts">All products</a></h5>
</div>
<br>
<br>
<div class="col-sm-6">
    <h5><a href="allcategories">All categories</a></h5>
</div>
<br>
<br>
<div class="col-sm-6">
    <h5><a href="byid">Categories by products</a></h5>
</div>
<br>
<br>
<div class="col-sm-6">
    <h5><a href="addproduct">Add new product</a></h5>
</div>
<br>
<br>
<div class="col-sm-6">
    <h5><a href="file">Download file</a></h5>
</div>
<br>
<br>
<div class="col-sm-6">
    <h6><a href="<c:url value="/logout" />">Logout</a></h6>
</div>

</body>

</html>
