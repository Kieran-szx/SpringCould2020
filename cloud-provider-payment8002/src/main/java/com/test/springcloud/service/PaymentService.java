package com.test.springcloud.service;

import com.test.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Shizx
 * @date 2020/7/1 9:20
 */
public interface PaymentService {

    public int creat(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
