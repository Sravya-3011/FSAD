package com.klu.service;
import java.util.List;
import com.klu.service.Student;
import com.klu.Student;
public interface StudentService {
	String getWelcomeMessage();
	Student createStudent(Student student);
	Student getStudentById(int id );
	List<Student>getAllStudents();
	Student updateStudent(int id,Student String)
	String deleteStudent(int id);
	List<Student>studentList=new ArrayList<>();
	
}
