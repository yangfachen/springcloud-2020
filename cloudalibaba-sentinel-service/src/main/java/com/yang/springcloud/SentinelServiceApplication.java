package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SentinelServiceApplication
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/8 10:32
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceApplication.class,args);
    }
}
