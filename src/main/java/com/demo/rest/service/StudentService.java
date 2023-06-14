package com.demo.rest.service;

import java.util.List;
import com.demo.rest.model.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student getStudentById(Long id);
	Student createStudent(Student student);
	Student updateStudent(Long id, Student student);
	void deleteStudent(Long id);
	List<Student> getStudentsByFirstName(String firstName);
	List<Student> getStudentsBySubjectName(String subjectName);
	List<Student> getStudentsBySubjectNameAndGrade(String subjectName, int grade);
}