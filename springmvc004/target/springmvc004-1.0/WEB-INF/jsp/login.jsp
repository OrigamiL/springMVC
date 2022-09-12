<%--
  Created by IntelliJ IDEA.
  User: zhezhi
  Date: 2022/9/12
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br>
<form action="${pageContext.request.contextPath}/login.action" method="post">
  用户名：<input type="text" name="username">
  密码：<input type="password" name="password">
  <input type="submit" value="登录">
</form>
<div><p style="color: red">${requestScope.get("error")}</p></div>
</body>
</html>
