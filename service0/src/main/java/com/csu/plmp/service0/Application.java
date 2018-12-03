package com.csu.plmp.service0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: PualrDwade
 * @CreateDate: 2018-12-3 15:01
 * @Description: 简单微服务类, 提供demo进行演示
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
