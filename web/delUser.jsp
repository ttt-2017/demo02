<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/25
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除用户信息页面</title>
</head>
    <form action="del" method="post">
      <table align="center">
        <tr>
          <td>请输入要删除的用户Id：</td>
          <td>
            <input type="text" placeholder="请输入要删除的用户Id" name="id">
          </td>
        </tr>
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="提交" align="center">
          </td>

        </tr>
      </table>
    </form>
<body>

</body>
</html>
