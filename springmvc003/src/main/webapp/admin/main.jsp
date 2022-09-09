<%--
  Created by IntelliJ IDEA.
  User: zhezhi
  Date: 2022/9/7
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>main....</h2>
<h2>requestUser====${requestScope.get("requestUser")}====${requestUser}</h2>
<h2>sessionUser====${sessionScope.get("sessionUser")}====${sessionUser}</h2>
<h2>modelMapUser====${modelMapUser}</h2>
<h2>modelUser====${modelUser}</h2>
<h2>mapUser====${mapUser}</h2>
<h2>${param.name}</h2><%--request.getParameter--%>

</body>
</html>
