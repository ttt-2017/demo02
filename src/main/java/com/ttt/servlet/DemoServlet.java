package com.ttt.servlet;

import java.io.IOException;

/**
 * Created by fanzhe on 2017/11/23.
 */
public class DemoServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.printf("demo test ");
        response.getWriter().println("haha");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getParameter("username");
        doPost(request,response);
    }
}
