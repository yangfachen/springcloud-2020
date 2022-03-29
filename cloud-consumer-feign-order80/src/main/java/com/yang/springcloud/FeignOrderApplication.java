package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName FeignOrderApplication
 * @Description TODO
 * @Author yangchen
 * @Date 2021/5/10 14:56
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class FeignOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignOrderApplication.class,args);
    }
}
