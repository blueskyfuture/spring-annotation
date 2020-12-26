package com.blueskyfuture.domain;

import com.blueskyfuture.ImportBeanDefinitionRegistrar.Mapper;

@Mapper
public class CountryMapper {
    public void hello(String name){
        System.out.println("hello:"+name);
    }
}
