package com.test.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful服务模板类，
 * 是Spring提供的用于访问Rest服务的客户端模板工具集，实现80到8001的远程调用。
 *
 * @author Shizx
 * @date 2020/7/1 15:10
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 使用@loadBalanced赋予Template负载均衡的能力
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
