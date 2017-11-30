
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
            <td><a href="hasUser.jsp" target="_blank">判断用户是否存在</a></td>
          </tr>
          <tr>
            <td>
              <a href="delUser.jsp" target="_blank">删除用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="addUser.jsp" target="_blank">添加用户信息</a></tr>
            </td>
          <tr>
            <td>
              <a href="getUser.jsp" target="_blank">根据用户名查询用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="getUserById.jsp" target="_blank">根据用户Id查询用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="getUserByAge.jsp" target="_blank">根据用户年龄查询用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="updateUser.jsp" target="_blank">更新用户信息</a>
            </td>
          </tr>
        </table>
      </div>
  </body>
</html>
