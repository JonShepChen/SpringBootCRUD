package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Student;
import com.example.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping(value="/{studentId}", method=RequestMethod.GET)
	@ResponseBody
	public Student getStudent(@PathVariable(name="studentId") Long id) {
		return studentService.getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@RequestMapping(value="/{studentId}", method=RequestMethod.PUT)
	public Student updateStudent(@PathVariable(name="studentId") Long id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}

	@RequestMapping(value="/{studentId}", method=RequestMethod.DELETE)
	public Student deleteStudent(@PathVariable(name="studentId") Long id) {
		return studentService.deleteStudent(id);
	}
}
