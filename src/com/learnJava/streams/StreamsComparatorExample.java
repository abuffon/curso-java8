package com.learnJava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortByName() {
		return StudentDataBase.getAllStudents().stream()
			.sorted(Comparator.comparing(Student::getName).reversed())
			.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		sortByName().forEach(System.out::println);
		
		System.out.println(sortByName());
	}

}
