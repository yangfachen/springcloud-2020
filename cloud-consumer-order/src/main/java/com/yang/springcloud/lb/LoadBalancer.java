package com.yang.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @InterfaceName LoadBalancer
 * @Description TODO
 * @Author yangchen
 * @Date 2021/5/10 11:22
 * @Version 1.0
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
