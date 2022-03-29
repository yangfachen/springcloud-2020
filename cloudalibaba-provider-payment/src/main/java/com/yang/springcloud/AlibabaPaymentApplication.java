package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AlibabaPaymentApplication
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/2 11:35
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaPaymentApplication.class,args);
    }
}
