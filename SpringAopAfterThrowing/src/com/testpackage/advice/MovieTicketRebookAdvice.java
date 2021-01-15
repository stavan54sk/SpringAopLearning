package com.testpackage.advice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;

public class MovieTicketRebookAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception ex) {
		System.out.println("#####################################################################################");
		System.out.println("PLease Re-book Your Ticket,"
				+ "As there was Exception while booking the ticket");
	}

}
