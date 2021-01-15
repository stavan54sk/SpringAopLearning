package com.testpackage.dto;

import lombok.Data;

@Data
public class Employee {

	private String name;

	private int id;

	private String address;
	
	public String toString()
	{
		return id+";"+name+";"+address;
		
	}
}
