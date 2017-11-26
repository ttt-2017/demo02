package com.ttt.servlet;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.util.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        ResultSet rs=new UserDAOImpl().getUserByName(name);
        try {
            if(rs.next()){
                response.getWriter().append("查询到的用户信息如下：<br/>").append("id="+rs.getInt("id")+"<br/>").
                        append("name="+rs.getString("name")+"<br/>").append("age="+rs.getInt("age")+"<br/>");

            }else{
                response.getWriter().println("用户不存在！");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);

    }
}
