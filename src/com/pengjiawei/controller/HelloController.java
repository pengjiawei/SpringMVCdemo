package com.pengjiawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author 彭家玮
 * @version V1.0
 * @className HelloController
 * @description //@PathVariable获取url中的Key值，处理这样的(/hello/{name})
 *              //@RequestParam获取参数中的key值处理这样的(/hello?name=pengjiawei)
 *              //@ResponseBody标注的方法返回一个对象，则会自动将该对象转换为JSON字符串返回
 * @date 2017/4/10
 */
@RestController
public class HelloController{
    @RequestMapping(value = "/hello")
    //jetty版本低获取getHeader有问题
    public String printHello(@RequestHeader(value = "User",defaultValue = "0000") String user) {
        System.out.println("http in = "+new Date(System.currentTimeMillis())+"   user = "+user);
        return "Action1";
    }
}
