package com.testpackage.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.testpackage.dto.Employee;

public class EmployeeValidator implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objects, Object object) throws Throwable {
		// TODO Auto-generated method stub
		Employee employee=(Employee)objects[0];
		System.out.println("##############################################################");
		System.out.println("Validation Method Name:"+method.getName());
		if(!(employee.getId()>1 && employee.getId()<10)) {
			System.out.println("###############################Employee Id should be between 1 and 10###################################");
		}
		if(!(employee.getName().length()>8)) {
			System.out.println("##############################Employee Id should be between 1 and 8######################################");
		}
	}

}
