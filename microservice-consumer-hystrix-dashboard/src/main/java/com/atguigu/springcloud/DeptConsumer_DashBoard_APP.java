package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author jiangfan
 * @create 2018/10/26 11:41
 * @Description: ${todo}
 */
@SpringBootApplication
@EnableHystrixDashboard //开启图形化的 Hystrix 的监控
public class DeptConsumer_DashBoard_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_APP.class,args);
    }
}
