
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
      <div align="center" style="border: 1px solid #000;height: 20%;width: 100%">
        <h1>
          <b>用户信息操作系统</b>
        </h1>
      </div>
        <div id="left" class="left" style="width: 100%;height: 70%;border: 1px solid #000;float: left">
        <table width="30%">
          <tr>
            <td><a href="hasUser.jsp" target="content">判断用户是否存在</a></td>
          </tr>
          <tr>
            <td>
              <a href="delUser.jsp" target="content">删除用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="addUser.jsp" target="content">添加用户信息</a></tr>
            </td>
          <tr>
            <td>
              <a href="getUser.jsp" target="content">根据用户名查询用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="getUserById.jsp" target="content">根据用户Id查询用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="getUserByAge.jsp" target="content">根据用户年龄查询用户信息</a>
            </td>
          </tr>
          <tr>
            <td>
              <a href="updateUser.jsp" target="content">更新用户信息</a>
            </td>
          </tr>
        </table>

          <div id="right" class="right" style="float: right;height: 100%;width: 70%">
            <iframe width="100%" height="100%" scrolling="yes" name="content" frameborder="1px">

            </iframe>
          </div>
        </div>
  </body>
</html>
