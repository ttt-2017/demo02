
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a{
        text-decoration: none;
      }
    </style>
  </head>
  <body>
      <div align="center">
        <h1>
          <b>用户信息操作系统</b>
        </h1>
        <br/>
        <table>
          <tr>
            <td><a href="hasUser.jsp">判断用户是否存在</a></td>
          </tr>
          <tr>
            <td>
              <a href="delUser.jsp">删除用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="addUser.jsp">添加用户信息</a></tr>
            </td>
          <tr>
            <td>
              <a href="getUser.jsp">根据用户名查询用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="updateUser.jsp">更新用户信息</a>
            </td>
          </tr>
        </table>
      </div>

  </body>
</html>
