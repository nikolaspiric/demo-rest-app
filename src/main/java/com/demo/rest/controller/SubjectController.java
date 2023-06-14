package com.demo.rest.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/rest")
public class SubjectController {
	
	/**
	 * Get All Subjects
	 */
//	@GetMapping(path = STUDENTS_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<Subject>> getSubjects() {
//		List<Subject> subjects = studentService.getAllStudents();
//		return new ResponseEntity(students, HttpStatus.OK);
//	}

}