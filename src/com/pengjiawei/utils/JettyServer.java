package com.pengjiawei.utils;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * @author 彭家玮
 * @version V1.0
 * @className JettyServer
 * @description //TODO 描述这个类的作用
 * @date 2017/3/22
 */
public class JettyServer extends Thread {

    @Override
    public void run() {
        String port = "8402";

        Server server = new Server(Integer.valueOf(port));

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setServer(server);
        webAppContext.setContextPath("/");

        //设置默认最多30秒就断开session (web.xml中已经进行了配置了)
        //webAppContext.getSessionHandler().getSessionManager().setMaxInactiveInterval(30);

        String webPath = null;

        try {
            webPath = new ClassPathResource("web").getURI().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(webPath);
        webAppContext.setResourceBase(webPath);

        // 指定web.xml配置文件
        webAppContext.setDescriptor(webPath + "/web.xml");

        // 指定webapp目录,web页面等资源可以放到这个目录下展示,动静态资源分开存放
        // context.setResourceBase( "/web/");
        // context.setParentLoaderPriority(true);

        //启动Server并阻塞在这里
        server.setHandler(webAppContext);
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
