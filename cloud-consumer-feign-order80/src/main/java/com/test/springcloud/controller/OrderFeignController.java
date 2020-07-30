package com.test.springcloud.controller;

import com.test.springcloud.entities.CommonResult;
import com.test.springcloud.entities.Payment;
import com.test.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther Shizx
 * @date 2020/7/27 16:54
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    /**
     * 测试OpenFeign超时控制
     *
     * @return
     */
    @GetMapping(value = "consumer/payment/feign/timeout")
    public String paymentFeineTimeout(){
        //openFeign底层为ribbon，客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
