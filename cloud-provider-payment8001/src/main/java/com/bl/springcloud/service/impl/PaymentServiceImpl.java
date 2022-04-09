package com.bl.springcloud.service.impl;

import com.bl.springcloud.dao.PaymentDao;
import com.bl.springcloud.entities.Payment;
import com.bl.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author bl
 * @date 2022/4/9 - 19:14
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }
}
