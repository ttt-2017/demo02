<%--
  Created by IntelliJ IDEA.
  User: Administrator
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
      <!--var inputId=document.getElementById("id")
      inputId.onkeyup=function(){
        var num=this.value;
        var re=/^[0-9]*[1-9][0-9]*$/;
        if(!re.test(num)){
          alert("用户Id必须是Int类型！")
        }
      }-->
      var inputAge=document.getElementById("age");
      inputAge.onkeyup=function(){
        var re=/^[0-9]*[1-9][0-9]*$/;
        if(inputAge.value<0 || inputAge.value>100 || !re.test(inputAge.value)){
          alert("用户年龄必须大于0小于100且必须是Int类型！")
        }
      }
    }
  </script>
</head>
<body>
    <form action="add" method="post">
      <table align="center">
        <!--<tr>
          <td>用户Id：</td>
          <td><input type="text" placeholder="请输入新用户的id" name="id" id="id"></td>
        </tr>-->
        <tr>
          <td>用户名称：</td>
          <td><input type="text" placeholder="请输入新用户的名称" name="name"></td>
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
