package com.trio.praveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.entity.Student;
import com.trio.praveen.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController
{
	@Autowired
	private StudentRepository studentrepository;
	
	@PostMapping("/save/details")
	public ResponseEntity<?> saveDtls(@RequestBody Student student)
	{
		return ResponseEntity.ok().body(studentrepository.save(student));
	}
	
	@GetMapping("/get/details")
	public ResponseEntity<?> getDtls()
	{
		return ResponseEntity.ok().body(studentrepository.findAll());
	}
	
}
