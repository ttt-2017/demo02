package com.ttt.servlet;
import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.util.DBUtils;

import java.io.IOException;
/**
 * Created by fanzhe on 2017/11/23.
 */
public class HasServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //System.out.printf("demo test ");
       // response.getWriter().println("haha");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String id=request.getParameter("id");
        String name = request.getParameter("name");
        String age=request.getParameter("age");
        User user=new User();
        user.setId(Integer.parseInt(id));
        user.setName(name);
        user.setAge(Integer.parseInt(age));
        if(!new UserDAOImpl().hasUser(user)){
            response.getWriter().println("用户不存在！");
        }else{
            response.getWriter().println("用户的信息如下所示：<br/>");
            response.getWriter().println("id="+id+"<br/>");
            response.getWriter().println("name="+name+"<br/>");
            response.getWriter().println("age="+age+"<br/>");
        }

    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);

    }
}
