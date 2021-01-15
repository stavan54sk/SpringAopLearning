package com.testpackage.testclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testpackage.dto.Employee;
import com.testpackage.service.EmployeeService;

public class TestClient {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("\\com\\testpackage\\configuration\\applicationContext.xml");
		EmployeeService employeeService=(EmployeeService)applicationContext.getBean("proxy");
		Employee employee=new Employee();
		employee.setName("StavanKodolikar");
		employee.setId(111);
		employee.setAddress("Pune");		
		employeeService.getEmployeeInfo(employee);
		employeeService.displayEmployeeInfo(employee);
		
	}

}
