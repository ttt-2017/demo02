package com.ttt.servlet;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/11/29.
 */
public class GetByIdServlet extends javax.servlet.http.HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String id=request.getParameter("id");
        User user=new UserDAOImpl().getUserById(Integer.parseInt(id));
        PrintWriter out = response.getWriter();
        if(user.getId()!=0 && !user.getName().equals(null) && user.getAge()!=0){
            out.println("<table border=1 align='center'>");
            out.println("<tr><td>用户Id</td><td>用户名称</td><td>用户年龄</td></tr>");
            out.print("<tr><td>"+user.getId()+"</td>"+"<td>"+user.getName()+"</td>"+"<td>"+user.getAge()+"</td>"+"</tr>");
            out.print("</table>");
        }else{
            out.print("不存在用户Id为"+id+"的用户！");
        }




    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
