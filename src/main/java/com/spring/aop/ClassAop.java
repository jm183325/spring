package com.spring.aop;

import org.springframework.stereotype.Component;

//@Component
public class ClassAop {
	public String get( String name) {
		System.out.println("执行");
		//int a=12/0;
		return "123";
	}
}
