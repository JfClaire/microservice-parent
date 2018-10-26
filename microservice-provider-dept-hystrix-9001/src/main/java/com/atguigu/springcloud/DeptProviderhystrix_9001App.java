package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker //对hystrix熔断机制的支持
public class DeptProviderhystrix_9001App {
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProviderhystrix_9001App.class, args);
	}
}
