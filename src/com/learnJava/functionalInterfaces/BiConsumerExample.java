package com.learnJava.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiConsumerExample {
	
	public static void nameAndActivities() {
		List<Student> students = StudentDataBase.getAllStudents();
		BiConsumer<String, List<String>> biConsumer = (name, activity) -> System.out.println(name + " : " + activity);
		
		students.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("a = " + a + " b = " + b);
		};
		
		biConsumer.accept("java7", "java8");
		
		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("Multiplication is = " + (a * b));
		};
		
		BiConsumer<Integer, Integer> division = (a, b) -> {
			System.out.println("Division is = " + (a/b));
		};
		
		multiply.andThen(division).accept(10, 5);
		
		nameAndActivities();
	}
}
