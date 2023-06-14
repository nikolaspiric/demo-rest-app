package com.demo.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.demo.rest.model.Student;
import com.demo.rest.model.Subject;
import com.demo.rest.service.StudentService;
import com.demo.rest.service.SubjectService;

@Component
public class SampleDataInitializer implements CommandLineRunner {
	
	private final StudentService studentService;
	private final SubjectService subjectService;
	//private final ProfessorService professorService;
	
//	@Autowired
//	public SampleDataInitializer(StudentService studentService, ProfessorService professorService, SubjectService subjectService) {
//		this.studentService = studentService;
//		this.professorService = professorService;
//		this.subjectService = subjectService;
//	}
	
	@Autowired
	public SampleDataInitializer(StudentService studentService, SubjectService subjectService) {
		this.studentService = studentService;
		this.subjectService = subjectService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		// Create sample subjects
		Subject subject1 = new Subject((long) 1, "Matematika", 9);
		Subject subject2 = new Subject((long) 2, "Elektrotehnika", 10);
		Subject subject3 = new Subject((long) 3, "Informatika", 6);
		Subject subject4 = new Subject((long) 4, "Programiranje", 8);
		Subject subject5 = new Subject((long) 5, "Fizika", 9);
		Subject subject6 = new Subject((long) 6, "Filozofija", 7);
		Subject subject7 = new Subject((long) 7, "Mehanika", 7);
		Subject subject8 = new Subject((long) 8, "Knjizevnost", 9);
		
		subjectService.createSubject(subject1);
		subjectService.createSubject(subject2);
		subjectService.createSubject(subject3);
		subjectService.createSubject(subject4);
		subjectService.createSubject(subject5);
		subjectService.createSubject(subject6);
		subjectService.createSubject(subject7);
		subjectService.createSubject(subject8);
		
		List<Subject> subjcts1 = new ArrayList<Subject>();
		subjcts1.add(subject1);
		subjcts1.add(subject2);
		subjcts1.add(subject7);
		
		List<Subject> subjcts2 = new ArrayList<Subject>();
		subjcts2.add(subject1);
		subjcts2.add(subject2);
		subjcts2.add(subject3);
		
		List<Subject> subjcts3 = new ArrayList<Subject>();
		subjcts3.add(subject2);
		subjcts3.add(subject4);
		subjcts3.add(subject5);
		
		List<Subject> subjcts4 = new ArrayList<Subject>();
		subjcts4.add(subject1);
		subjcts4.add(subject4);
		subjcts4.add(subject5);
		
		List<Subject> subjcts5 = new ArrayList<Subject>();
		subjcts5.add(subject8);
		subjcts5.add(subject6);
		subjcts5.add(subject5);
		
		List<Subject> subjcts6 = new ArrayList<Subject>();
		subjcts6.add(subject8);
		subjcts6.add(subject7);
		subjcts6.add(subject6);
		
		
		// Create sample students
		Student student1 = new Student((long) 1, "Marko", "Markovic", "marko@gmail.com", "0645453234");
		student1.setSubjects(subjcts1);
		
		Student student2 = new Student((long) 2, "Petar", "Petrovic", "petar@gmail.com", "0643465466");
		student2.setSubjects(subjcts2);
		
		Student student3 = new Student((long) 3, "Nikola", "Nikolic", "nikola@gmail.com", "064657653");
		student3.setSubjects(subjcts3);
		
		Student student4 = new Student((long) 4, "Sima", "Simic", "sima@gmail.com", "0648763534");
		student4.setSubjects(subjcts4);
		
		Student student5 = new Student((long) 5, "Bogdan", "Bogdanovic", "bogdan@gmail.com", "06487092");
		student5.setSubjects(subjcts5);
		
		Student student6 = new Student((long) 6, "Ivan", "Ivanovic", "ivan@gmail.com", "0640971123");
		student6.setSubjects(subjcts6);
		
		Student student7 = new Student((long) 6, "Marko", "Ivanovic", "mivan@gmail.com", "0640970044");
		
		studentService.createStudent(student1);
		studentService.createStudent(student2);
		studentService.createStudent(student3);
		studentService.createStudent(student4);
		studentService.createStudent(student5);
		studentService.createStudent(student6);
		studentService.createStudent(student7);
		
		
		// Create sample professors
		//Professor professor1 = new Professor();
		//Professor professor2 = new Professor();
		
		//professorService.createProfessor(professor1);
		//professorService.createProfessor(professor2);
	}
}