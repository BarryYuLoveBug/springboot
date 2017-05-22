package com.springboot.config;

import com.springboot.annotation.SpringBootAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @description <p>springweb 应用配置</p>
 * @path spring-boot/com.springboot.annotation
 * @author heshiyuan
 * @date 2017/4/26 下午3:00
 * @github http://github.com/shiyuan2he
 * @author shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@SpringBootAnnotation
public class SpringWebApplication {

    @SuppressWarnings("unused")
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver ;
    }
}