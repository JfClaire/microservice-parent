package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiangfan
 * @create 2018/10/25 14:49
 * @Description: 自定义负载均衡配置类
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule()
    {
        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
        //return new RoundRobinRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
        return new RandomRuleJf();//达到的目的，自定义的规则，每台服务器调用5次
    }
}
