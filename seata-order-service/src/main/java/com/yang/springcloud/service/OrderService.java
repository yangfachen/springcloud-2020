package com.yang.springcloud.service;

import com.yang.springcloud.entities.Order;

/**
 * @InterfaceName OrderService
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/17 16:18
 * @Version 1.0
 */
public interface OrderService {

    void create(Order order);
}
