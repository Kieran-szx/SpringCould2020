package com.test.springcloud.dao;

import com.test.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Shizx
 * @date 2020/7/1 9:03
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
