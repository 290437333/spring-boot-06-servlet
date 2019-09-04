package com.example.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 测试的是关于应用的启动与关闭
 */
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Springboot.Servlet监听器应用启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Springboot.Servlet监听器应用销毁");
    }
}
