package com.example.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TeacherDao;
import com.example.entities.Teacher;
import com.example.services.TeacherService;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherDao teacherDao;

	@Override
	public Teacher getTeacher(Long id) {
		return teacherDao.findById(id);
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherDao.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Long id, Teacher teacher) {
		if(teacherDao.exists(id)) {
			teacher.setId(id);
			return teacherDao.save(teacher);
		}
		return null;
	}

	@Override
	public Long deleteTeacher(Long id) {
		return teacherDao.deleteById(id);
	}

	@Override
	public Iterable<Teacher> getAllTeachers() {
		return teacherDao.findAll();
	}

}
