package com.learnJava.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	
	public static void filterStudentByGradeLevel() {
		System.out.println("filterStudentByGradeLevel()");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents.forEach((s -> {
			if (p1.test(s)) {
				System.out.println(s);
			}
		}));
	}
	
	public static void filterStudentByGpa() {
		System.out.println("filterStudentByGpa()");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents.forEach((s -> {
			if (p2.test(s)) {
				System.out.println(s);
			}
		}));
	}
	
	public static void filterStudents() {
		System.out.println("filterStudents()");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents.forEach((s -> {
			if (p1.or(p2).negate().test(s)) {
				System.out.println(s);
			}
		}));
	}
	
	public static void main(String[] args) {
		filterStudentByGradeLevel();
		filterStudentByGpa();
		filterStudents();
	}
}
