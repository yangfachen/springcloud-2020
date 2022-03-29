package com.yang.springcloud.dao;

import com.yang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description TODO
 * @Author yangchen
 * @Date 2021/4/10 15:27
 * @Version 1.0
 */
@Mapper
//@Repository不用Spring的
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
