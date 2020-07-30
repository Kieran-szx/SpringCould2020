package com.test.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡类
 * 这个自定义配置类不能放在@ComponentScan 所扫描的当前包下以及子包下，否则自定义的配置类就会被所有的Ribbon客户端所共享，
 * 达不到特殊化定制的目的
 *
 * @auther Shizx
 * @date 2020/7/27 14:50
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule MyRule() {
        return new RandomRule();
    }
}
