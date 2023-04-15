package com.hanhu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author hanhu
 * @date 2023/4/9 20:24
 */
@Configuration
public class ApplicationContextConfig {

    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    //去掉LoadBalanced，手写轮询
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
