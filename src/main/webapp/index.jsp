<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>办公系统</title>
</head>
<body>
<h1>欢迎登录，办公系统！</h1>
<br>
当前登录用户:<%=request.getRemoteUser()%>
<br>
<a href="http://192.168.188.130:9100/cas/logout">退出登录</a>
</body>
</html>
