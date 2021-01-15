package com.testpackage.dto;



import org.springframework.aop.framework.ProxyFactoryBean;

import lombok.Data;

@Data
public class Institute {

	private String name;

	@Override
	public String toString() {

		return name;
	}

}
