package com.atguigu.bean1;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ServiceB {
    @Resource
    private ServiceA serviceA;

    public ServiceB() {
        System.out.println("ServiceB start...");
    }

    public ServiceA getServiceA() {
        return serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
