package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName NacosOrderApplication
 * @Description TODO
 * @Author yangchen
 * @Date 2021/6/2 14:53
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApplication.class,args);
    }
}
