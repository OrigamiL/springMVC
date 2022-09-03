<%--
  Created by IntelliJ IDEA.
  User: zhezhi
  Date: 2022/9/3
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/demo.action">连接服务器</a>
<br>
<form action="${pageContext.request.contextPath}/req.action" method="post">
    <input type="submit" value="提交">
</form><br><br>
<h2>1.单个数据提交</h2>
<form action="${pageContext.request.contextPath}/one.action">
    姓名：<input type="text" name="myName">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
