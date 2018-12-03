package com.csu.plmp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: PualrDwade
 * @CreateTime: 2018/12/4 14:20
 * @Description: 系统服务发现注册中心的启动类, 使用Eureka技术实现
 */

@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
