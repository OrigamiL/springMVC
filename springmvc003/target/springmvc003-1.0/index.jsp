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
    <script src="js/jquery-3.6.0.js"></script>
</head>
<body>
<script type="text/javascript">
    function showStu(){
        $.ajax({
            url:"${pageContext.request.contextPath}/list.action",
            type:"get",
            dataType:"json",
            success(stuList){
                let s="";
                $.each(stuList,function (i, stu) {
                    s+=stu.name+"----"+stu.age+"<br>";
                })
               /* document.getElementById("myDiv").innerHTML=s*/
                console.log(stuList)
                $("#myDiv").html(s)
            }
        })
    }
</script>
<%--<button onclick="GetStudents()">获取</button>--%>
<a href="javascript:showStu()">访问服务器返回学生集合</a>
<div id="myDiv">等待服务器返回数据</div>
<a href="${pageContext.request.contextPath}/one.action">1.请求转发页面(默认)</a><br>
<a href="${pageContext.request.contextPath}/two.action">2.请求转发action</a><br>
<a href="${pageContext.request.contextPath}/three.action">3.重定向页面</a><br>
<a href="${pageContext.request.contextPath}/four.action">4.重定向action</a><br>
</body>
</html>
