package com.atguigu.config;

import com.atguigu.annotation.LoadBalancedTest;
import com.atguigu.bean.Bus;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

/**
 * —≠ª∑“¿¿µ
 */
@ComponentScan("com.atguigu.bean1")
@Configuration
public class MainConfigOfCircleDepend {

}
