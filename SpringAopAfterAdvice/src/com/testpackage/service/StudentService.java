package com.testpackage.service;

import com.testpackage.dto.Institute;
import com.testpackage.dto.Student;

public interface StudentService {

	public void registerStudent(Student student,Institute institute);
	
	public void loginStudent(Student student,Institute institute);
}
