<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <h1>增加Emp</h1>
        <form method="post" action="emp/insertOne">
            <input name="ename" placeholder="姓名"><br>
            <input name="deptno" placeholder="部门号"><br>
            <input name="empno" placeholder="个人编号"><br>
            <input type="date" name="hiredate" placeholder="入厂日期"><br>
            <input type="submit">
        </form>
    </div>
</body>
</html>
