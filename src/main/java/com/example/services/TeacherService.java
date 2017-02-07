package com.example.services;

import com.example.entities.Teacher;

public interface TeacherService {

	public Teacher getTeacher(Long id);
	public Teacher addTeacher(Teacher teacher); 
	public Teacher updateTeacher(Long id, Teacher teacher);
	public Teacher deleteTeacher(Long id);

}
