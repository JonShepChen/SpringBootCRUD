package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PresentationController {
	
	@RequestMapping("/students")
	public String getStudentHome() {
		return "Student";
	}
	

}
