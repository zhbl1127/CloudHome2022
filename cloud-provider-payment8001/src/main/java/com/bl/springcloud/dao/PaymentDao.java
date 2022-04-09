package com.bl.springcloud.dao;

import com.bl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * https://github.com/zhbl1127/git-demo.git
 * git@github.com:zhbl1127/git-demo.git
 * @author bl
 * @date 2022/4/9 - 19:04
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
