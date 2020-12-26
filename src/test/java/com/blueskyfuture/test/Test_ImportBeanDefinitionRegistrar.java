package com.blueskyfuture.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigOfAOP;
import com.blueskyfuture.ImportBeanDefinitionRegistrar.MapperAutoConfig;
import com.blueskyfuture.domain.CountryMapper;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_ImportBeanDefinitionRegistrar {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MapperAutoConfig.class);
        CountryMapper countryMapper = applicationContext.getBean(CountryMapper.class);
        countryMapper.hello("zhang");
        System.out.println(countryMapper.getClass());
        applicationContext.close();
    }
}
