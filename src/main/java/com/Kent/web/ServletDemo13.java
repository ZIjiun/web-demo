package com.Kent.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo13")
public class ServletDemo13 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // HttpServletRequest 是針對 HTTP 協議封裝的 Servlet request
        // HttpServletResponse 是針對 HTTP 協議封裝的 Servlet response
        System.out.println(req); //org.apache.catalina.connector.RequestFacade@7bcefdab req、resp 都是由 tomcat 實做出來的
        String name = req.getParameter("name"); //url?name = Kevin

        resp.setHeader("content-type", "text/html;charset=utf-8");
        resp.getWriter().write("<h1>%s,歡迎您!<h1>".formatted(name));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
