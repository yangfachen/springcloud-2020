package com.yang.springcloud.domain;

/**
 * @ClassName CommonResult
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/17 16:04
 * @Version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}
