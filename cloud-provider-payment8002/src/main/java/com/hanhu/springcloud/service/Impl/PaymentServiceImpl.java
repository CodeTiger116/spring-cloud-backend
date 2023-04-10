package com.hanhu.springcloud.service.Impl;

import com.hanhu.springcloud.dao.PaymentDao;
import com.hanhu.springcloud.entities.Payment;
import com.hanhu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hanhu
 * @date 2023/4/9 18:16
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }

}
