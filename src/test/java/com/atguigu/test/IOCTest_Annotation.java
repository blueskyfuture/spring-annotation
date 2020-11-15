package com.atguigu.test;

import com.atguigu.bean.Bus;
import com.atguigu.bean.Color;
import com.atguigu.config.MainConfigOfAnnotation;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Annotation {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAnnotation.class);
		Bus bus01 = (Bus)applicationContext.getBean("bus01");
		System.out.println("bus01:"+bus01);
		Bus bus02 = (Bus)applicationContext.getBean("bus02");
		System.out.println("bus02:"+bus02);
		applicationContext.close();
	}

}
