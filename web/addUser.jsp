<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/25
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户页面</title>
</head>
<body>
    <form action="add" method="post">
      <table align="center">
        <tr>
          <td>用户Id：</td>
          <td><input type="text" placeholder="请输入新用户的id" name="id"></td>
        </tr>
        <tr>
          <td>用户名称：</td>
          <td><input type="text" placeholder="请输入新用户的名称" name="name"></td>
        </tr>
        <tr>
          <td>用户年龄：</td>
          <td><input type="text" placeholder="请输入新用户的年龄" name="age"></td>
        </tr>
        <tr>
          <td colspan="2" align="center"><input type="submit" value="提交"></td>
        </tr>
      </table>
    </form>
</body>
</html>
