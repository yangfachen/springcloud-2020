package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigClientApplication
 * @Description TODO
 * @Author yangchen
 * @Date 2021/5/26 14:40
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }
}
