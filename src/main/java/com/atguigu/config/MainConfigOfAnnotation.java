package com.atguigu.config;

import com.atguigu.annotation.LoadBalancedTest;
import com.atguigu.bean.Bus;
import com.atguigu.bean.Car;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

/**
 * Annotation测试
 * 参考LoadBalancerAutoConfiguration
 */
@ComponentScan("com.atguigu.bean")
@Configuration
public class MainConfigOfAnnotation {

	@LoadBalancedTest
	@Bean(name = "bus01")
	public Bus getBus01(){
		Bus bus = new Bus();
		bus.setBusNo(1001);
		return bus;
	}

	@LoadBalancedTest
	@Bean(name = "bus02")
	public Bus getBus02(){
		Bus bus = new Bus();
		bus.setBusNo(1002);
		return bus;
	}

	/**
	 * 验证是否可以获取到所有使用的@LoadBalancedTest的bean
	 */
	@LoadBalancedTest
	@Autowired(required = false)
	private List<Bus> busList = Collections.emptyList();


	@Bean
	public SmartInitializingSingleton loadBalancedRestTemplateInitializer() {
		return new SmartInitializingSingleton() {
			public void afterSingletonsInstantiated() {
				for (Bus bus : MainConfigOfAnnotation.this.busList) {
					System.out.println("before:"+bus);
					bus.setBusNo(bus.getBusNo() * 2);
					System.out.println("after:"+bus);
				}
			}
		};
	}

	@Bean("busList")
	public List<Bus> getBusList() {
		return MainConfigOfAnnotation.this.busList;
	}
}
