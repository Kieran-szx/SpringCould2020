package com.test.springcloud.service.impl;

import com.test.springcloud.dao.PaymentDao;
import com.test.springcloud.entities.Payment;
import com.test.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Shizx
 * @date 2020/7/1 9:21
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int creat(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
