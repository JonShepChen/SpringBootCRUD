package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Department;
import com.example.services.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value="/{deptId}", method=RequestMethod.GET)
	@ResponseBody
	public Department getDepartment(@PathVariable(name="deptId") Long id) {
		return departmentService.getDepartment(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Department addDepartment(@RequestBody Department dept) {
		return departmentService.addDepartment(dept);
	}

	@RequestMapping(value="/{deptId}", method=RequestMethod.PUT)
	@ResponseBody
	public Department updateDepartment(@PathVariable(name="deptId") Long id, @RequestBody Department dept) {
		return departmentService.updateDepartment(id, dept);
	}
	
	@RequestMapping(value="/{deptId}", method=RequestMethod.DELETE)
	@ResponseBody
	public Long deleteDepartment(@PathVariable(name="deptId") Long id) {
		return departmentService.deleteDepartment(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Iterable<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

}
