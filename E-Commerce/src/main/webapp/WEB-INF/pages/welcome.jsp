<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <title>Welcome page</title>
</head>

<%@ page import="java.util.Date" %>
<body>
<script src="/resources/vendor/js/jquery-2.2.2.js" type="application/javascript"></script>
<script src="resources/vendor/js/bootstrap.min.js"></script>
<link href="resources/vendor/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<br/>
<h3>&emsp; Welcome to the web application</h3>
<br/>
<div class="col-sm-12">
    <h5>&emsp;Current time is: <%=new Date() %></h5>
</div>
<br>
<br>
<div class="col-sm-12">
    <h5><a href="login">Please, sign in</a></h5>
</div>
<br>
<br>
<div class="col-sm-12">
    <h5><a href="registration">Please, register</a></h5>
</div>
<br>
<br>
<div class="col-sm-12">
    <h5><a href="home">Go to main page</a></h5>
</div>
</body>

</html>