<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

<head>
    <title>Uploading the products</title>
    <script src="resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
    <script src="resources/custom/js/allCategoriesJS.js" type="application/javascript"></script>
    <script src="resources/vendor/js/bootstrap.min.js"></script>
    <link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<h4 align="center">Uploading the products</h4>

<div class="form-group" style="width:400px; margin:0 auto;">
    <form action="addproduct" method="POST" class="form-horizontal">

        <label for="categories">Category:</label>
        <select title="categories" id="categories" name="categoryId">
        </select>

        <div class="input-group input-sm">
            <label class="input-group-addon" for="productArea"><i
                    class="fa fa-user"></i><strong>Area:</strong></label>
            <input type="text" class="form-control" id="productArea" name="productArea"
                   placeholder="Enter area" required>
        </div>

        <div class="input-group input-sm">
            <label class="input-group-addon" for="productPrice"><i
                    class="fa fa-lock"></i><strong>Price:</strong></label>
            <input type="text" class="form-control" id="productPrice" name="productPrice"
                   placeholder="Enter price" required>
        </div>

        <div class="input-group input-sm">
            <label class="input-group-addon" for="productYear"><i
                    class="fa fa-lock"></i><strong>Year:</strong></label>
            <input type="text" class="form-control" id="productYear" name="productYear"
                   placeholder="Enter year" required>
        </div>

        <div class="input-group input-sm">
            <label class="input-group-addon" for="productRoomsNumber"><i
                    class="fa fa-lock"></i><strong>Rooms:</strong></label>
            <input type="text" class="form-control" id="productRoomsNumber" name="productRoomsNumber"
                   placeholder="Enter rooms number" required>
        </div>

        <div class="input-group input-sm">
            <label class="input-group-addon" for="productLocation"><i
                    class="fa fa-lock"></i><strong>Location:</strong></label>
            <input type="text" class="form-control" id="productLocation" name="productLocation"
                   placeholder="Enter location" required>
        </div>

        <div class="form-group">
            <label for="productDescription">Description:</label>
            <textarea class="form-control" rows="5" id="productDescription" name="productDescription"></textarea>
        </div>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <div class="form-actions">
            <input type="submit"
                   class="btn btn-block btn-primary btn-default" value="Add product">
        </div>
    </form>
</div>

</body>

</html>
