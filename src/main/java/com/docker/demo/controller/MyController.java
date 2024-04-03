package com.docker.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.demo.dto.Student;
import com.docker.demo.service.MyService;

@RestController
@RequestMapping("/student")
public class MyController {
	@Autowired
	MyService myService;
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student std) {
	return	myService.add(std);
	
	}
	@GetMapping("/get")
	public List<Student> getStudent(){
		
		return myService.get();
	}
	
	
}
