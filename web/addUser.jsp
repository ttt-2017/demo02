<%--
  Created by IntelliJ IDEA.
  User: qwm
  Date: 2017/11/25
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户页面</title>
  <script>
    window.onload=function(){
      var inputAge=document.getElementById("age");
      inputAge.onkeyup=function(){
        var re=/^[0-9]*[1-9][0-9]*$/;
        if(inputAge.value<0 || inputAge.value>100 || !re.test(inputAge.value)){
          alert("用户年龄必须大于0小于100且必须是Int类型！")
        }
      }
    }
  </script>
  <script>
    function checkForm(){
      var nameValue=document.getElementById("name").value;
      if(nameValue==null || nameValue==""){
        alert("用户名称不能为空")
        return false
      }
      var ageValue=document.getElementById("age").value;
      if(ageValue==null || ageValue==""){
        alert("用户年龄不能为空")
        return false
      }
      return true
    }
  </script>
 <!-- <style>
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
  </style>-->

</head>
<body>
    <%@include file="title.jsp"%>

    <form action="add" method="post" onsubmit="return checkForm()">
      <table align="center">
        <tr>
          <td>用户名称：</td>
          <td><input type="text" placeholder="请输入新用户的名称" name="name" id="name"></td>
        </tr>
        <tr>
          <td>用户年龄：</td>
          <td><input type="text" placeholder="请输入新用户的年龄" name="age" id="age"></td>
        </tr>
        <tr>
          <td colspan="2" align="center"><input type="submit" value="提交"></td>
        </tr>
      </table>
    </form>
</body>
</html>
