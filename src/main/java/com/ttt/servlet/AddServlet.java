package com.ttt.servlet;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.util.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/11/25.
 */
public class AddServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charaset=UTF-8");
        String id=request.getParameter("id");
        String name = request.getParameter("name");
        String age=request.getParameter("age");
        User user=new User();
        user.setId(Integer.parseInt(id));
        user.setName(name);
        user.setAge(Integer.parseInt(age));
        if(new UserDAOImpl().addUser(user)){
            response.getWriter().println("添加记录成功<br/>");
            response.getWriter().println("新用户的信息如下所示：<br/>");
            response.getWriter().println("id="+id+"<br/>");
            response.getWriter().println("name="+name+"<br/>");
            response.getWriter().println("age="+age+"<br/>");
        }else{
            response.getWriter().println("新用户添加失败！");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
