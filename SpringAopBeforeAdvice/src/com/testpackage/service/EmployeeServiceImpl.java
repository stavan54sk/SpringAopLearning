package com.testpackage.service;


import com.testpackage.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void getEmployeeInfo(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("#################################################################");
		System.out.println("getEmployeeInfo");
		System.out.println("Employee Id :"+employee.getId());
	}

	@Override
	public void displayEmployeeInfo(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("#################################################################");
		System.out.println("displayEmployeeInfo");
		System.out.println("Employee Name :"+employee.getName());
		System.out.println("Employee Address :"+employee.getAddress());
	}

}
