package com.example.services;

import org.springframework.stereotype.Service;

import com.example.entities.Teacher;

@Service
public interface TeacherService {

	public Teacher getTeacher(Long id);
	public Teacher addTeacher(Teacher dept); 
	public Teacher updateTeacher(Long id, Teacher dept);
	public Teacher deleteTeacher(Long id);

}
