package com.testpackage.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class Feedback implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] params, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("########################################################################");
		System.out.println("Method Executed:"+method);
		System.out.println("Student Used:"+params[0]);
		System.out.println("Institute Used:"+params[1]);
		System.out.println("########################################################################");

	}

}
