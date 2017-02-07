package com.example.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.example.dao.DepartmentDao;
import com.example.entities.Department;
import com.example.services.DepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDao departmentDao;
	
	@Override
	public Department getDepartment(Long id) {
		return departmentDao.findById(id);
	}

	@Override
	public Department addDepartment(Department dept) {
		return departmentDao.save(dept);
	}

	@Override
	public Department updateDepartment(Long id, Department dept) {
		if(departmentDao.exists(id)) {
			dept.setId(id);
			return departmentDao.save(dept);
		}
		return null;
	}

	@Override
	public Long deleteDepartment(Long id) {
		return departmentDao.deleteById(id);
	}

	@Override
	public Iterable<Department> getAllDepartments() {
		return departmentDao.findAll();
	}

}
