package com.atguigu.test;

import com.atguigu.bean.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.MainConifgOfAutowired;
import com.atguigu.dao.BookDao;
import com.atguigu.service.BookService;

public class IOCTest_Autowired {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);
		
		BookService bookService = applicationContext.getBean(BookService.class);
		System.out.println(bookService);
		
		//BookDao bean = applicationContext.getBean(BookDao.class);
		//System.out.println(bean);
		
		Boss boss = applicationContext.getBean(Boss.class);
		System.out.println(boss);
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
		Bus bus = applicationContext.getBean(Bus.class);
		System.out.println("bus:"+bus);

		Color color = applicationContext.getBean(Color.class);
		System.out.println(color);
		System.out.println(applicationContext);
		applicationContext.close();
	}


	@Test
	public void test02(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);
		//MainConifgOfAutowired注入Color获取通过调用方法getBus获取Bus对象，与
		//容器applicationContext中Bus对象都是同一个对象
		Bus bus = applicationContext.getBean(Bus.class);
		System.out.println("bus:"+bus);

		Color color = applicationContext.getBean(Color.class);
		System.out.println(color);
		applicationContext.close();
	}

}
