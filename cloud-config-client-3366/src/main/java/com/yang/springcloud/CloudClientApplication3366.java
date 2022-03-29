package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName CloudClientApplication3366
 * @Description TODO
 * @Author yangchen
 * @Date 2021/5/27 9:35
 * @Version 1.0
 */

@SpringBootApplication
@EnableEurekaClient
public class CloudClientApplication3366 {


    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication3366.class,args);
    }
}
