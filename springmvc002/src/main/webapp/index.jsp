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
</form><br>

<h2>2.对象封装数据提交</h2>
<form action="${pageContext.request.contextPath}/two.action" method="post">
    姓名：<input type="text" name="name">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form><br>
<h2>3.动态占位符提交</h2>
<a href="${pageContext.request.contextPath}/three/张三/22.action">动态提交</a>
<br>
<h2>4.参数名称不一致解决方案</h2>
<form action="${pageContext.request.contextPath}/four.action" method="post">
    姓名：<input type="text" name="name">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form><br>
<h2>5.手工提取数据</h2>
<form action="${pageContext.request.contextPath}/five.action" method="post">
    姓名：<input type="text" name="name">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form><br>
<br>
</body>
</html>
