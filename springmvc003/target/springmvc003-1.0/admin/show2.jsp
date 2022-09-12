<%--
  Created by IntelliJ IDEA.
  User: zhezhi
  Date: 2022/9/12
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
  <table width="800px" border="1">
      <tr>
          <th>姓名</th>
          <th>生日</th>
      </tr>
      <c:forEach items="${requestScope.get('studentList')}" var="student" >
          <tr>
              <td>${student.name}</td>
              <td>${student.birth}--- <fmt:formatDate value="${student.birth}" pattern="yyyy-MM-dd"/> </td>
          </tr>
      </c:forEach>
  </table>
</div>
</body>
</html>
