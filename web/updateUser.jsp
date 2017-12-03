<%--
  Created by IntelliJ IDEA.
  User: qwm
  Date: 2017/11/25
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新用户信息页面</title>
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
  </script>
  <script>
    function updateComfirm(){
      if(confirm("确定要更新该记录吗！")){
        return true;
      }else{
        return false;
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
    <form action="update" method="post" onsubmit="return checkForm()">
      <table align="center">
        <tr>
          <td>需要更新的用户Id：</td>
          <td><input type="text" placeholder="请输入要更新的用户id" name="id" id="id"></td>
        </tr>
        <tr>
          <td>更新后的用户名称：</td>
          <td><input type="text" placeholder="请输入新的用户名称" name="name" id="name"></td>
        </tr>
        <tr>
          <td>更新后的用户年龄：</td>
          <td><input type="text" placeholder="请输入新的用户年龄" name="age" id="age"></td>
        </tr>
        <tr>
          <td colspan="2" align="center"><input type="submit" value="提交" onclick="return updateComfirm()"></td>
        </tr>
      </table>
    </form>
</body>
</html>
