package com.test.springcould.service.impl;

import com.test.springcould.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author Shizx
 * @date 2020/8/28 10:36
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
