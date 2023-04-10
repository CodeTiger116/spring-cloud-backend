package com.hanhu.springcloud.service;

import com.hanhu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author hanhu
 * @date 2023/4/9 18:25
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
