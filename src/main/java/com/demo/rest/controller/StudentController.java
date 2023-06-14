package com.demo.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.rest.model.Student;
import com.demo.rest.service.StudentService;

@RestController
@RequestMapping(value = "/rest")
public class StudentController {
	
	private static final String STUDENTS_PATH = "/students";
	private static final String STUDENT_PATH = "/students/{id}";
	private static final String STUDENT_NAME_PATH = "/students/name/{firstName}";
	private static final String STUDENT_BY_SUBJECT_PATH = "/students/subject/{subjectName}";
	private static final String STUDENT_BY_GRADE_SUBJECT_PATH = "/students/subject/{subjectName}/grade/{grade}";
	
	private final StudentService studentService;
	
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	/**
	 * Test endpoint
	 */
	@GetMapping({"/hello"})
	public String helloWorld() {
		return "Hello World";
	}
	
	
	/**
	 * Get All Students
	 */
	@GetMapping(path = STUDENTS_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> students = studentService.getAllStudents();
		return new ResponseEntity(students, HttpStatus.OK);
	}
	
	
	/**
	 * Get One Student by ID
	 */
	@GetMapping(path = STUDENT_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
		return new ResponseEntity(studentService.getStudentById(id) ,HttpStatus.OK);
	}
	
	
	/**
	 * Create One New Student
	 * @param student
	 * @return
	 */
	@PostMapping(path = STUDENTS_PATH, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student newStudent = studentService.createStudent(student);
		return new ResponseEntity(newStudent, HttpStatus.OK);
	}
	
	
	/**
	 * Update One Old Student
	 * @param id
	 * @param student
	 * @return
	 */
	@PutMapping(path = STUDENT_PATH, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		Student updatedStudent = studentService.updateStudent(id, student);
		return new ResponseEntity(updatedStudent, HttpStatus.OK);
	}
	
	
	/**
	 * Delete One Student
	 */
	@DeleteMapping(path = STUDENT_PATH)
	public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id) {
		studentService.deleteStudent(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	/**
	 * Take all students taking the same subject   
	 * @return
	 */
	@GetMapping(path = STUDENT_BY_SUBJECT_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getStudentsBySubjectName(@PathVariable("subjectName") String subjectName) {
		List<Student> students = studentService.getStudentsBySubjectName(subjectName);
		return new ResponseEntity(students, HttpStatus.OK);
	}
	
	
	/**
	 * Take all students with same name
	 * @param firstName
	 * @return
	 */
	@GetMapping(path = STUDENT_NAME_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getStudentsByFirstName(@PathVariable("firstName") String firstName) {
		List<Student> students = studentService.getStudentsByFirstName(firstName);
		return new ResponseEntity(students, HttpStatus.OK);
	}
	
	
	/**
	 * Take all students with same subjet and same grade from that subject
	 * @param subjectName
	 * @param grade
	 * @return
	 */
	@GetMapping(path = STUDENT_BY_GRADE_SUBJECT_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getStudentsBySubjectNameAndGrade(@PathVariable("subjectName") String subjectName, @PathVariable("grade") int grade) {
		List<Student> students = studentService.getStudentsBySubjectNameAndGrade(subjectName, grade);
		return new ResponseEntity(students, HttpStatus.OK);
	}
 }