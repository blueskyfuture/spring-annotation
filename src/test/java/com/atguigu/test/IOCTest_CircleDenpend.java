package com.atguigu.test;

import com.atguigu.bean.Bus;
import com.atguigu.bean1.ServiceA;
import com.atguigu.bean1.ServiceB;
import com.atguigu.config.MainConfigOfAnnotation;
import com.atguigu.config.MainConfigOfCircleDepend;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * —≠ª∑“¿¿µ
 */
public class IOCTest_CircleDenpend {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfCircleDepend.class);
		ServiceA serviceA = (ServiceA)applicationContext.getBean("serviceA");
		System.out.println("serviceA:"+serviceA);
		ServiceB serviceB = (ServiceB)applicationContext.getBean("serviceB");
		System.out.println("serviceB.getServiceA:"+serviceB.getServiceA());
		if(serviceA == serviceB.getServiceA()){
			System.out.println("ok");
		}
		applicationContext.close();
	}

}
