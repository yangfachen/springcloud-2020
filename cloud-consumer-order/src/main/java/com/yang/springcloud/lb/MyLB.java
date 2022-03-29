package com.yang.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyLB
 * @Description TODO
 * @Author yangchen
 * @Date 2021/5/10 11:25
 * @Version 1.0
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);
    public final int getAndIncrement(){
        int currentValue;
        int nextValue;

        do {
            currentValue = this.atomicInteger.get();
            nextValue = currentValue >=2147483647?0:currentValue+1;
        }while (!this.atomicInteger.compareAndSet(currentValue,nextValue));
        System.out.println("************next"+nextValue);
        return nextValue;

    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement()%serviceInstances.size();
        return serviceInstances.get(index);
    }
}
