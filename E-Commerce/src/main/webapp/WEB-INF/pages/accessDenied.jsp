<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <title>AccessDenied page</title>
</head>

<body>
<script src="/resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
<script src="resources/vendor/js/bootstrap.min.js"></script>
<link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<br/>
<div class="col-sm-12">
    <h5>&emsp; Dear ${userModel}, You are not authorized to access this page. Please
        <a href="<c:url value="/logout" />">logout</a></h5>
</div>
</body>

</html>