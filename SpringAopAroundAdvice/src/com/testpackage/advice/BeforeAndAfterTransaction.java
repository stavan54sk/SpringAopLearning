package com.testpackage.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.testpackage.dto.Account;

public class BeforeAndAfterTransaction implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		Object[] params=methodInvocation.getArguments();
		Account account =(Account) params[0];
		int amt =(int) params[1];
		System.out.println("###########################################################");
		System.out.println("Sending Message Before withdrawal for Account for Amount:"+amt);
		methodInvocation.proceed();
		System.out.println("###########################################################");
		System.out.println("Sending Message After withdrawal for Account for Total Balance:"+account.getBalance());
		return null;
	}
	
	
}
