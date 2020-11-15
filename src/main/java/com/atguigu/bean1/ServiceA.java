package com.atguigu.bean1;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ServiceA {
    @Resource
    private ServiceB serviceB;

    public ServiceA() {
        System.out.println("ServiceA start...");
    }
}
