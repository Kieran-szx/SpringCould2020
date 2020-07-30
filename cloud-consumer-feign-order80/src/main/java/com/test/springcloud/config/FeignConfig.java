package com.test.springcloud.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 配置OpenFeign日志打印功能
 *
 * @auther Shizx
 * @date 2020/7/30 15:41
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }

    /**
     * 默认超时时间，设为7秒
     *
     * 用@Bean注入， .yml相对的超时配置会被覆盖
     *
     * @return
     */
    @Bean
    public static Request.Options requestOptions() {
        return new Request.Options(5000, 5000);
    }
}
