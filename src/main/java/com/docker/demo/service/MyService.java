package com.docker.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.docker.demo.dto.Student;

@Service
public class MyService {
	List<Student> al = new ArrayList<>();

	public Student add(Student std) {
		Optional<Student> std1=al.stream().filter(p-> p.getId()==std.getId()).findAny();
boolean b=		std1.isEmpty();
		if(b) {
			System.out.println("Student added");
			al.add(std);			
			return std;
		}else {
			System.out.println("student is duplicated");
			std.setId(0);
			std.setAddress(null);
			std.setName(null);
			return std;
		}

	}

	public List<Student> get(){
		System.out.println("returning ListOfStudent");
		return al;
	}
}

