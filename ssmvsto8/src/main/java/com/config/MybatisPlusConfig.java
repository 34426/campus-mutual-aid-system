package com.config;

import com.baomidou.mybatisplus.mapper.ISqlInjector;
import com.baomidou.mybatisplus.mapper.LogicSqlInjector;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 作为一个配置类
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * 乐观锁插件
     * @return
     */
   /* @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {

        return new OptimisticLockerInterceptor();

    }*/

    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {

        return new PaginationInterceptor();

    }

    /**
     * 逻辑删除配置
     * @return
     */
    @Bean
    public ISqlInjector sqlInjector() {

        return new LogicSqlInjector();

    }

    /**
     * SQL 执行性能分析插件
     * 开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长
     */
   /* @Bean
    @Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {

        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();

        performanceInterceptor.setMaxTime(100);//ms，超过此处设置的ms则sql不执行

        performanceInterceptor.setFormat(true);

        return performanceInterceptor;

    }
*/
}
