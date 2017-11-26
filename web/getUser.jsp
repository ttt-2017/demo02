<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/25
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>根据用户名称查询用户信息页面</title>
</head>
<body>
   <form action="getUser" method="post">
     <table align="center">
       <tr>
         <td>用户名称：</td>
         <td><input type="text" placeholder="请输入用户的名称" name="name"></td>
       </tr>
       <tr>
         <td colspan="2" align="center"><input type="submit" value="提交"></td>
       </tr>
     </table>
   </form>
</body>
</html>
