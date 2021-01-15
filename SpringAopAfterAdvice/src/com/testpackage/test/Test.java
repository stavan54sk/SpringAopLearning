package com.testpackage.test;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testpackage.dto.Institute;
import com.testpackage.dto.Student;
import com.testpackage.service.StudentService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com\\testpackage\\configuration\\applicationContext.xml");
		StudentService studentService=(StudentService) applicationContext.getBean("proxy");
		Student student=new Student();
		student.setId(111);
		student.setName("STAVANKODOLIKAR");
		student.setAddress("PUNE");
		Institute institute=new Institute();
		institute.setName("WISDOM");
		studentService.registerStudent(student, institute);
		studentService.loginStudent(student, institute);
	}
}
