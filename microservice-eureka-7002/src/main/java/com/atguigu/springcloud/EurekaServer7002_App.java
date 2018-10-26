package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jiangfan
 * @create 2018/10/24 17:38
 * @Description: eureka主启动类
 */
@SpringBootApplication
@EnableEurekaServer //EurekaServer服务器端启动类,接受其他服务注册进来
public class EurekaServer7002_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
