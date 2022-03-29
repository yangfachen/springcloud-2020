package com.yang.springcloud.service;

/**
 * @InterfaceName StorageService
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/18 10:39
 * @Version 1.0
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
