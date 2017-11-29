package com.ttt.servlet;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.util.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/25.
 */
public class GetByNameServlet extends javax.servlet.http.HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charaset=UTF-8");
        String name = request.getParameter("name");
        PrintWriter out = response.getWriter();
        List<User> userList=new UserDAOImpl().getUserByName(name);
        if(userList.size()>0) {
            out.println("<table border=1 align='center'>");
            out.println("<tr><td>用户Id</td><td>用户名称</td><td>用户年龄</td></tr>");
            for (User user : userList) {
                out.print("<tr>");
                out.print("<td>"+user.getId()+"</td>");
                out.print("<td>"+user.getName()+"</td>");
                out.print("<td>"+user.getAge()+"</td>");
                out.print("</tr>");
            }
            out.print("</table>");
        }else{
            response.getWriter().println("用户不存在！");}
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);

    }
}
