package com.spring.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
public class LoggingAspectXml {
	public void before(JoinPoint j) {
		String methodName = j.getSignature().getName();
		List<Object> asList = Arrays.asList(j.getArgs());
		System.out.println("前置通知"+methodName+asList);
	}
	public void after() {
		System.out.println("后置通知");
	}
	public void afterReturning(Object result) {
		System.out.println("结果通知"+result);
	}
	public void afterThrowing(Exception e) {
		System.out.println("异常通知"+e);
	}
	public void around(ProceedingJoinPoint pjp) {
		System.out.println("环绕前置通知");
		try {
			pjp.proceed();
			System.out.println("环绕结果通知");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("环绕异常通知");
			e.printStackTrace();
		}
		System.out.println("环绕后置通知");
	}
}
