<%--
  Created by IntelliJ IDEA.
  User: qwm
  Date: 2017/11/29
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息查询界面</title>
    <script>
      window.onload=function(){
        var inputId=document.getElementById("id")
        inputId.onkeyup=function(){
          var num=this.value;
          var re=/^[0-9]*[1-9][0-9]*$/;
          if(!re.test(num)){
            alert("用户Id必须是Int类型！")
          }
        }
        var inputAge=document.getElementById("age");
        inputAge.onkeyup=function(){
          var re=/^[0-9]*[1-9][0-9]*$/;
          if(inputAge.value<0 || inputAge.value>100 || !re.test(inputAge.value)){
            alert("用户年龄必须大于0小于100且必须是Int类型！")
          }
        }
      }
      function checkForm(){
        var idValue=document.getElementById("id").value;
        if(idValue==null || idValue==""){
          alert("用户Id不能为空")
          return false
        }

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
</head>
<body>
  <%@include file="title.jsp"%>

  <form action="Check" method="post" onsubmit="return checkForm()">
    <table border="0" cellpadding="10" cellspacing="0" align="center">
      <tr>
        <td><label>用户Id：</label></td>
        <td><input type="text" placeholder="请输入要查询的用户id" name="id" id="id"></td>
      </tr>
      <tr>
        <td><label>用户名称：</label></td>
        <td><input type="text" placeholder="请输入要查询的用户名" name="name" id="name"/></td>
      </tr>
      <tr>
        <td><label>用户年龄：</label></td>
        <td><input type="text" placeholder="请输入用户的年龄" name="age" id="age"></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" value="提交"/></td>
      </tr>
    </table>
  </form>

</body>
</html>
