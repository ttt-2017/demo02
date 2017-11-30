<%--
  Created by IntelliJ IDEA.
  User: qwm
  Date: 2017/11/29
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>根据用户年龄查询用户信息</title>
  <script>
    window.onload=function(){
      var inputAge=document.getElementById("age");
      inputAge.onkeyup=function(){
        var re=/^[0-9]*[1-9][0-9]*$/;
        if(inputAge.value<0 || inputAge.value>100 || !re.test(inputAge.value)){
          alert("用户年龄必须大于0小于100且必须是Int类型！")
        }
      }
      var inputAge1=document.getElementById("age1");
      inputAge1.onkeyup=function(){
        var re=/^[0-9]*[1-9][0-9]*$/;
        if(inputAge1.value<0 || inputAge1.value>100 || !re.test(inputAge1.value)){
          alert("用户年龄必须大于0小于100且必须是Int类型！")
        }
      }
    }
  </script>
  <script>
    function checkForm(){
      var ageValue=document.getElementById("age").value;
      if(ageValue==null || ageValue==""){
        alert("用户年龄不能为空")
        return false
      }
      var age1Value=document.getElementById("age1").value;
      if(age1Value==null || age1Value==""){
        alert("用户年龄不能为空")
        return false
      }
      return true
    }
  </script>
</head>
<body>
  <%@include file="title.jsp"%>
  <form action="getUserByAge" method="post" onsubmit="return checkForm()">
    <table align="center">
      <tr>
        <td rowspan="2">用户年龄：</td>
        <td><input type="text" placeholder="请输入用户的年龄" name="age" id="age"></td>
      </tr>
      <tr>
        <td><input type="text" placeholder="请输入用户的年龄" name="age1" id="age1"></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" value="提交"></td>
      </tr>
    </table>
  </form>
</body>
</html>
