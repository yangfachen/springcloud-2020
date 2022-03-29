package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AlibabaPaymentApplication9002
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/2 11:47
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentApplication9002 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaPaymentApplication9002.class,args);
    }
}
