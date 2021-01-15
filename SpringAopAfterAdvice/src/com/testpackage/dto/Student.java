package com.testpackage.dto;

import lombok.Data;

@Data
public class Student {

	private String name;

	private String address;

	private int id;
	
	@Override
	public String toString()
	{
		return id+";"+name+";"+address;
	}

}
