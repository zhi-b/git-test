<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    td{
        text-align: center;
    }
</style>
<body>
    <div align="center">
        <h1>Emp表</h1>
        <a href="/add.jsp">添加Emp</a>
        <table border="1px" cellpadding="2px" cellspacing="0px">
            <thead>
                <tr>
                    <td>姓名</td>
                    <td>部门号</td>
                    <td>个人编号</td>
                    <td>入厂日期</td>
                    <td colspan="2">操作</td>
                </tr>
            </thead>

            <tbody>
            <c:forEach items="${emps}" var="emp">
                <tr>
                    <td>${emp.ename}</td>
                    <td>${emp.deptno}</td>
                    <td>${emp.empno}</td>
                    <td>${emp.hiredate.toLocaleString()}</td>
                    <td><a href="/emp/delete?empno=${emp.empno}">删除</a></td>
                    <td><a href="/update.jsp?empno=${emp.empno}">修改</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div>
            <a href="/emp/findAll?pageNum=1">首页</a>
            <a href="/emp/findAll?pageNum=${pageInfo.prePage}">上一页</a>
            <c:forEach var="page" end="${pageInfo.pages}" begin="1" step="1">
                <a href="/emp/findAll?pageNum=${page}">${page}</a>
            </c:forEach>
            <a href="/emp/findAll?pageNum=${pageInfo.nextPage}">下一页</a>
            <a href="/emp/findAll?pageNum=${pageInfo.pages}">尾页</a>
        </div>
        </div>



</body>
</html>
