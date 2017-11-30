<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/30
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <style>
    .title{
      background-color: black;
      height: 30px;

    }
    .title ul li{
      list-style-type:none ;
      display: inline;
    }
    .title a{
      font-size: 20px;
      color:white;
      text-decoration: none;
    }
  </style>
</head>
<body>
<div class="title" align="center">
  <ul>
    <li><a href="hasUser.jsp" class="abc" target="_blank">HasUser&nbsp;&nbsp;&nbsp;</a></li>
    <li><a href="addUser.jsp" target="_blank">AddUser&nbsp;&nbsp;&nbsp;</a></li>
    <li><a href="delUser.jsp" target="_blank">DelUser&nbsp;&nbsp;&nbsp;</a></li>
    <li><a href="getUser.jsp" target="_blank">GetUser&nbsp;&nbsp;&nbsp;</a></li>
    <li><a href="getUserByAge.jsp" target="_blank">GetUserByAge&nbsp;&nbsp;&nbsp;</a></li>
    <li><a href="getUserById.jsp" target="_blank">GetUserById&nbsp;&nbsp;&nbsp;</a></li>
    <li><a href="updateUser.jsp" target="_blank">UpdateUser&nbsp;&nbsp;&nbsp;</a></li>
  </ul>
</div>
</body>
</html>
