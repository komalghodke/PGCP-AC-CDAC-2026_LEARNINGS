package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* com.demo.beans.*.*(..))")
	public void beforeAdvice() {
		System.out.println("in before advice");
	}

	@After("execution(* com.demo.beans.*.*(..))")
	public void afterAdvice() {
		System.out.println("in after advice");
	}
	@AfterThrowing("execution(* com.demo.beans.*.*(..))")
	public void afterThrowingAdvice() {
		System.out.println("in afterThrowingAdvice advice");
	}
	
	@AfterReturning("execution(* com.demo.beans.*.*(..))")
	public void afterReturningAdvice() {
		System.out.println("in afterReturningAdvice advice");
	}
	
	@Around("execution(* com.demo.beans.*.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("In aroundadvice before function call");
		Object obj=joinpoint.proceed();    
		System.out.println("In aroundadvice afer function call");
		return obj;
	}
}
