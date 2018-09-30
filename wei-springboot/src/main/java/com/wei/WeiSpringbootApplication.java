package com.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注解@SpringBootApplication是Sprnig Boot项目的核心注解，主要目的是开启自动配置
 */
@SpringBootApplication
public class WeiSpringbootApplication {

    /**
     * 标准的Java应用的main的方法，主要作用是作为项目启动的入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(WeiSpringbootApplication.class, args);
    }
}
