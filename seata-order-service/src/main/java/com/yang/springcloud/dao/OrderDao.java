package com.yang.springcloud.dao;

import com.yang.springcloud.entities.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName OrderDao
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/17 16:07
 * @Version 1.0
 */
@Mapper
public interface OrderDao {

    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
