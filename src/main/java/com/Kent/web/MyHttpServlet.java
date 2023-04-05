package com.Kent.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 實作 Servlet 的介面
 */
public class MyHttpServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 根據請求方式的不同，進行分別的處理

        HttpServletRequest request = (HttpServletRequest) servletRequest;

        // 1. 取得請求的方式
        String method = request.getMethod();

        // 2. 判斷
        if ("GET".equals(method)) {
            // get 方式的處理邏輯
            doGet(servletRequest, servletResponse);
        }else if ("POST".equals(method)){
            // post 方式的處理邏輯
            doPost(servletRequest, servletResponse);
        }
    }

    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
    }

    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
