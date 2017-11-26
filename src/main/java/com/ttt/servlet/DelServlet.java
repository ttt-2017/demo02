package com.ttt.servlet;

import com.ttt.dao.UserDAOImpl;
import com.ttt.util.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/11/25.
 */
public class DelServlet extends javax.servlet.http.HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String id=request.getParameter("id");
        if(new UserDAOImpl().deleteUserById(Integer.parseInt(id))){
            response.getWriter().println("删除成功！");
        }else{
            response.getWriter().println("不存在id为"+id+"的记录！");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }
}
