package com.yang.springcloud.entities;

/**
 * @ClassName Payment
 * @Description TODO
 * @Author yangchen
 * @Date 2021/5/7 16:40
 * @Version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
