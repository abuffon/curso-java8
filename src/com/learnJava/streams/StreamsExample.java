package com.learnJava.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		
		Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
		Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
		
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.peek(System.out::println) //for debug
				.filter(p1)
				.peek(s -> System.out.println("after p1 " + s)) //for debug
				.filter(p2)
				.peek(s -> System.out.println("after p2 " + s)) //for debug
//				.filter(p1.and(p2))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentMap);
	}
}
