package com.pengjiawei.controller;

import com.pengjiawei.interceptor.FirstInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 彭家玮
 * @version V1.0
 * @className WebConfig
 * @description //这个类暂时没有使用成功，采用配置文件的方式使用拦截器
 * @date 2017/4/10
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/**");
    }
}
