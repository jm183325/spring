package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContextAop.xml");
		ClassAop classAop=(ClassAop) ac.getBean("classAop");
		classAop.get("12");
	}
}
