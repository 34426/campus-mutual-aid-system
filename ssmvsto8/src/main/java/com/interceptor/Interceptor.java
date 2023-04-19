package com.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Interceptor implements WebMvcConfigurer {

    @Bean
    AuthorizationInterceptor getInterceptorRegistry(){
        return new AuthorizationInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        registry.addInterceptor(getInterceptorRegistry())
                .addPathPatterns("/**")
                // excludePathPatterns 用户排除拦截
                .excludePathPatterns("/upload");
        //排除不需要拦截的路径
    }
}
