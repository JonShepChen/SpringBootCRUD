package com.example.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.entities.Student;
import com.example.services.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public Student getStudent(Long id) {
		return studentDao.findById(id);
	}

	@Override
	public Student addStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		if(studentDao.exists(id)) {
			student.setId(id);
			return studentDao.save(student);
		}
		return null;
	}

	@Override
	public Long deleteStudent(Long id) {
		return studentDao.deleteById(id);
	}

	@Override
	public Iterable<Student> getAllStudents() {
		return studentDao.findAll();
	}

}
