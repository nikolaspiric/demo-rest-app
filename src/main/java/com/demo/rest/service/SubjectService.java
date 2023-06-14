package com.demo.rest.service;

import java.util.List;
import com.demo.rest.model.Subject;

public interface SubjectService {
	
	List<Subject> getAllSubjects();
	Subject getSubjectById(Long id);
	Subject createSubject(Subject subject);
	Subject updateSubject(Subject subject);
	void deleteSubject(Long id);
	List<Subject> getSubjectsByStudent(Long studentId);
	List<Subject> getSubjectsBySProfessor(Long professorId);
	List<Subject> getSubjectsByGrade(int grade);
}