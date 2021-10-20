package com.learnJava.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	
	public static void filterStudentByGradeLevel() {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents.forEach((s -> {
			if (p1.test(s)) {
				System.out.println(s);
			}
		}));
	}
	
	public static void main(String[] args) {
		filterStudentByGradeLevel();

	}
}
