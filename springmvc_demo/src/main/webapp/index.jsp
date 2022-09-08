<%--
  Created by IntelliJ IDEA.
  User: zhezhi
  Date: 2022/9/5
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/demo.action">跳转</a>
<form action="${pageContext.request.contextPath}/demo.action" method="get">
    <input type="text" name="name">
    <input type="submit" value="提交">
</form>
</body>
</html>
