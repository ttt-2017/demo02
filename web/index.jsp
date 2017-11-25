<%--
  Created by IntelliJ IDEA.
  User: fanzhe
  Date: 2017/11/23
  Time: 下午1:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户信息查询界面</title>
  </head>
  <body>
    <form action="" method="post">
      <table width="200" border="0" cellpadding="10" cellspacing="0" align="center">
        <tr>
          <td><label>ID:</label></td>
          <td><input type="text" placeholder="请输入要查询的用户id" name="id" ></td>
        </tr>
        <tr>
          <td><label>Name:</label></td>
          <td><input type="text" placeholder="请输入要查询的用户名" name="name"/></td>
        </tr>
        <tr>
          <td><label>Age:</label></td>
          <td><input type="text" placeholder="请输入用户的年龄" name="age"></td>
        </tr>
        <tr>
          <td colspan="2" align="center"><input type="submit" value="提交"/></td>
        </tr>
      </table>
    </form>
  </body>
</html>
