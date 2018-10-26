package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author jiangfan
 * @create 2018/10/26 15:35
 * @Description: ${todo}
 */
@SpringBootApplication
@EnableConfigServer //开启分布式配置中心服务端的功能
public class Config_3344_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
    }
}
