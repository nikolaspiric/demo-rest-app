package com.demo.rest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.rest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByFirstName(String firstName);
	List<Student> findBySubjects_SubjectName(String subjectName);
	List<Student> findBySubjects_SubjectNameAndSubjectsGrade(String subjectName, int grade);
}