<%--
  Created by IntelliJ IDEA.
  User: qwm
  Date: 2017/11/29
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>根据用户Id查询用户信息</title>
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
    }
    function checkForm(){
      var idValue=document.getElementById("id").value;
      if(idValue==null || idValue==""){
        alert("用户Id不能为空")
        return false
      }
      return true
    }
  </script>
</head>
<body>
  <%@include file="title.jsp"%>
  <form action="getUserById" method="post" onsubmit="return checkForm()">
    <table align="center">
      <tr>
        <td>用户Id：</td>
        <td><input type="text" placeholder="请输入用户的Id" name="id" id="id"></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" value="提交"></td>
      </tr>
    </table>
  </form>
</body>
</html>
