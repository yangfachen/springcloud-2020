package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderNacosMain84
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/9 17:31
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosMain84 {


    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class,args);
    }
}
