package com.yang.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yang.springcloud.entities.CommonResult;

/**
 * @ClassName CustomerBlockHandler
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/9 15:48
 * @Version 1.0
 */

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }

}
