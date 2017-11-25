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
    <title>$Title$</title>
  </head>
  <body>
    <form action="servlet/DemoServlet" method="post">
      <input type="text" placeholder="请输入要查询的用户id" name="id" ><br/><br/>
      <input type="text" placeholder="请输入要查询的用户名" name="name"/><br/><br/>
      <input type="text" placeholder="请输入用户的年龄" name="age"><br/><br/>
      <input type="submit" value="提交"/>
    </form>

     <!-- <a href="demo">hit me</a>-->

  </body>
</html>
