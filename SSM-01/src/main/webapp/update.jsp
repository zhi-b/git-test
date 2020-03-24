<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <h1>修改信息</h1>
        <form method="post" action="emp/update">
            <input name="ename" placeholder="姓名"><br>
            <input name="deptno" placeholder="部门号"><br>
            <input type="date" name="hiredate" placeholder="入厂日期"><br>
            <input name="empno" value="${param.empno}" type="hidden"><br>
            <input type="submit">
        </form>
    </div>
</body>
</html>
