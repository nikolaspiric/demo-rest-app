package com.demo.rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.rest.model.Student;
import com.demo.rest.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		Student oldStudent = studentRepository.getById(id);
		oldStudent.setId(id);
		oldStudent.setFirstName(student.getFirstName());
		oldStudent.setLastName(student.getLastName());
		oldStudent.setEmail(student.getEmail());
		oldStudent.setTelephoneNumber(student.getTelephoneNumber());
		return studentRepository.save(oldStudent);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

	@Override
	public List<Student> getStudentsByFirstName(String firstName) {
		return studentRepository.findByFirstName(firstName);
	}

	@Override
	public List<Student> getStudentsBySubjectName(String subjectName) {
		return studentRepository.findBySubjects_SubjectName(subjectName);
	}

	@Override
	public List<Student> getStudentsBySubjectNameAndGrade(String subjectName, int grade) {
		return studentRepository.findBySubjects_SubjectNameAndSubjectsGrade(subjectName, grade);
	}
}