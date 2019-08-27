package com.spring.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspectAnnotation {
	@Pointcut("execution(* com.spring.aop.*.*(..))")
	public void expression() {}
//	@Before("expression()")
//	public void before(JoinPoint j) {
//		String methodName = j.getSignature().getName();
//		List<Object> asList = Arrays.asList(j.getArgs());
//		System.out.println("前置通知"+methodName+asList);
//	}
//	@After("expression()")
//	public void after() {
//		System.out.println("后置通知");
//	}
//	@AfterReturning(value="expression()",returning="result")
//	public void afterReturning(Object result) {
//		System.out.println("结果通知"+result);
//	}
//	@AfterThrowing(value="execution(* com.spring.aop.*.*(..))",throwing="e")
//	public void afterThrowing(Exception e) {
//		System.out.println("异常通知"+e);
//	}
	@Around("expression()")
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
