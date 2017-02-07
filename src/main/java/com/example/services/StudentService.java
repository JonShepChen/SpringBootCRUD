package com.example.services;

import com.example.entities.Student;

public interface StudentService {

	public Student getStudent(Long id);
	public Student addStudent(Student student); 
	public Student updateStudent(Long id, Student student);
	public Long deleteStudent(Long id);
	public Iterable<Student> getAllStudents();

}
