package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConsulOrder80
 * @Description TODO
 * @Author yangchen
 * @Date 2021/5/8 11:04
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80.class,args);
    }
}
