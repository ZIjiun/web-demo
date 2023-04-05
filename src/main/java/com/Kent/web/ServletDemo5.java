package com.Kent.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 繼承自定義的 Servlet class，只需要直接覆寫 doGet、doPost，不用再重新複寫 Servlet 的方法
 */
@WebServlet("/demo5")
public class ServletDemo5 extends MyHttpServlet {
    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("get ...");
    }

    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("post ...");
    }
}
