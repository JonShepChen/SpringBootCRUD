package com.example.services;

import org.springframework.stereotype.Service;

import com.example.entities.Student;

@Service
public interface StudentService {

	public Student getStudent(Long id);
	public Student addStudent(Student dept); 
	public Student updateStudent(Long id, Student dept);
	public Student deleteStudent(Long id);

}
