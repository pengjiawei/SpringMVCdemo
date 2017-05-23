package com.pengjiawei;

import com.pengjiawei.utils.JettyServer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 彭家玮
 * @version V1.0
 * @className Main
 * @description //TODO 描述这个类的作用
 * @date 2017/5/8
 */
public class Main {
    public static void main(String[] args) {
        JettyServer jettyServer = new JettyServer();
        jettyServer.start();
    }
}
