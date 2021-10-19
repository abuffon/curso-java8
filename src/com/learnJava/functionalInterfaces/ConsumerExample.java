package com.learnJava.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerExample {
	static Consumer<Student> c2 = (s) -> System.out.println(s);
	static Consumer<Student> c3 = (s) -> System.out.println(s.getName());
	static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());
	
	
	static void printName() {
		System.out.println("\nprintName");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents.forEach(c2);
	}
	
	static void printNameAndActivities() {
		System.out.println("\nprintNameAndActivities");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents.forEach(c3.andThen(c4));//consumer chaining
	}

	static void printNameAndActivitiesCondition() {
		System.out.println("\nprintNameAndActivitiesCondition");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		allStudents.forEach(student -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				c3.andThen(c4).accept(student);//consumer chaining
			}
		});
	} 
	
	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		c1.accept("java8");
		
		printName();
		printNameAndActivities();
		printNameAndActivitiesCondition();
	}

}
