package com.bl.springcloud.service;

import com.bl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author bl
 * @date 2022/4/9 - 19:13
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
