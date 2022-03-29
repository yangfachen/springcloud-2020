package com.yang.springcloud.service;

import com.yang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName PaymentService
 * @Description TODO
 * @Author yangchen
 * @Date 2021/4/10 15:38
 * @Version 1.0
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
