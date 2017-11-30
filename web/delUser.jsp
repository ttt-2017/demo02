<%--
  Created by IntelliJ IDEA.
  User: qwm
  Date: 2017/11/25
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除用户信息页面</title>
    <script>
      window.onload=function(){
        var inputId=document.getElementById("id")
        inputId.onkeyup= function () {
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
    <script>
      function delComfirm(){
        if(confirm("确定要删除该记录吗？")){
          return true;
        }else{
          return false;
        }
      }

    </script>
</head>
    <form action="del" method="post" onsubmit="return checkForm()">
      <table align="center">
        <tr>
          <td>请输入要删除的用户Id：</td>
          <td>
            <input type="text" placeholder="请输入要删除的用户Id" name="id" id="id">
          </td>
        </tr>
        <tr>
          <td colspan="2" align="center">
            <input type="submit" value="提交" align="center" onclick="return delComfirm()">
          </td>
        </tr>
      </table>
    </form>
<body>

</body>
</html>
