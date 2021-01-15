package com.testpackage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testpackage.dto.Account;
import com.testpackage.service.Transaction;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com\\testpackage\\configuration\\applicationContext.xml");
		Transaction transaction=(Transaction) applicationContext.getBean("proxy");
		Account account =new Account(); 
		account.setBalance(5000);
		account.setName("Stavan");
		transaction.withDrawMoney(account,100);
	}
}
