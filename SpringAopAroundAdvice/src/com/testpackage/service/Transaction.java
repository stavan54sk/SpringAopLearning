package com.testpackage.service;

import com.testpackage.dto.Account;

public interface Transaction {
	
	public void withDrawMoney(Account account,int amount);

}
