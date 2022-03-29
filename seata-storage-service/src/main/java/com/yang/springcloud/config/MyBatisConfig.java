package com.yang.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/17 17:27
 * @Version 1.0
 */
@Configuration
@MapperScan({"com.yang.springcloud.dao"})
public class MyBatisConfig {
}
