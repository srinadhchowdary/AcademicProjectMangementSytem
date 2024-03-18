package com.klef.jfsd.sdpproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdpproject.model.Student;
import com.klef.jfsd.sdpproject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student checkstudentlogin(String email, String pwd) {
		return studentRepository.checkstudentlogin(email, pwd);}

}
