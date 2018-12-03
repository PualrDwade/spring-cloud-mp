package com.csu.plmp.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: PualrDwade
 * @CreateTime: 2018/12/4 14:20
 * @Description: 通过配置中心.可以查看到所有服务的配置文件信息
 */


//全局配置server
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
