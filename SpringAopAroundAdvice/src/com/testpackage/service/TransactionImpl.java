package com.testpackage.service;

import com.testpackage.dto.Account;

public class TransactionImpl implements Transaction{

	public void withDrawMoney(Account account,int amonut) {
		System.out.println("###########################################################");
		System.out.println("Withdrawing Money from Account");
		int total=account.getBalance()-amonut;
		account.setBalance(total);
	}

}
