package com.testpackage.service;

import com.testpackage.dto.Institute;
import com.testpackage.dto.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public void registerStudent(Student student, Institute institute) {
		// TODO Auto-generated method stub
		System.out.println("####################################################################################");
		System.out.println("Registering Student:"+student);
		System.out.println("Registering Institute:"+institute);
		
		
	}

	@Override
	public void loginStudent(Student student, Institute institute) {
		// TODO Auto-generated method stub
		System.out.println("####################################################################################");
		System.out.println("Logging in Student:"+student);
		System.out.println("Logging in Institute:"+institute);
	}



}
