package com.demo.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class ProfessorController {
	
	private static final String PROFESSORS_PATH = "/professors";
	private static final String PROFESSOR_PATH = "/professors/{id}";

}