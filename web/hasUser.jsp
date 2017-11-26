<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/25
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息查询界面</title>
</head>
<body>
<form action="Check" method="post">
  <table border="0" cellpadding="10" cellspacing="0" align="center">
    <tr>
      <td><label>用户Id：</label></td>
      <td><input type="text" placeholder="请输入要查询的用户id" name="id" ></td>
    </tr>
    <tr>
      <td><label>用户名称：</label></td>
      <td><input type="text" placeholder="请输入要查询的用户名" name="name"/></td>
    </tr>
    <tr>
      <td><label>用户年龄：</label></td>
      <td><input type="text" placeholder="请输入用户的年龄" name="age"></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><input type="submit" value="提交"/></td>
    </tr>
  </table>
</form>

</body>
</html>
