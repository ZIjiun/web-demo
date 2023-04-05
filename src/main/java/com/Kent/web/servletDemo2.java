package com.Kent.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Servlet 生命週期方法
 */
@WebServlet(urlPatterns = "/demo2", loadOnStartup = 1)
public class servletDemo2 implements Servlet {

    /**
     * 初始化方法
     * 1. 調用時機: 預設情況下，Servlet 被第一次訪問時調用.
     *      * loadOnStartUp:
     * 2. 調用次數:1
     * @param servletConfig
     * @throws ServletException
     */

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    /**
     * 提供服務
     * 1. 調用時機: 每一次 Servlet 被訪問時調用
     * 2. 調用次數: 每次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet hello world");
    }

    /**
     * 銷毀方法
     * 1. 調用時機: 記憶體釋放或是伺服器關閉的時候，Servlet 物件會被銷毀
     * 2. 調用次數: 1 次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}