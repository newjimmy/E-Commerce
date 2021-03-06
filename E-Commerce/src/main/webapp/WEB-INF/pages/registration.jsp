<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

<head>
    <title>Registration page</title>
    <script src="resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
    <script src="resources/vendor/js/bootstrap.min.js"></script>
    <link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<br/>
<br/>
<br/>
<div class="container" style="width:400px; margin:0 auto;">
    <form:form method="POST" modelAttribute="userModel" action="registration" enctype="utf8" role="form-horizontal">

        <div class="form-group">
            <form:label path="username" for="username">Username:</form:label>
            <form:input type="text" path="username" id="username" class="form-control" placeholder="Enter username"/>
            <form:errors path="username"/>
        </div>

        <div class="form-group">
            <form:label path="email" for="email">Email:</form:label>
            <form:input type="text" path="email" id="email" class="form-control" placeholder="Enter email"/>
            <form:errors path="email"/>
        </div>

        <div class="form-group">
            <form:label path="password" for="password"><strong>Password:</strong></form:label>
            <form:input type="password" path="password" id="password" class="form-control" placeholder="Enter password"/>
            <form:errors path="password"/>
        </div>

        <button type="submit" class="btn btn-primary btn-block">Register</button>

    </form:form>
</div>
</body>

</html>