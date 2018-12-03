package com.csu.plmp.reverseProxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: PualrDwade
 * @CreateTime: 2018/12/3 15:10
 * @Description: 使用Zuul配置路由代理, 服务使用方只需要知道服务name
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
