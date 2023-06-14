package com.demo.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.rest.model.Subject;
import com.demo.rest.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	private final SubjectRepository subjectRepository;
	
	@Autowired
	public SubjectServiceImpl(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}

	@Override
	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}

	@Override
	public Subject getSubjectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject createSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Override
	public Subject updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSubject(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject> getSubjectsByStudent(Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getSubjectsBySProfessor(Long professorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getSubjectsByGrade(int grade) {
		// TODO Auto-generated method stub
		return null;
	}
}