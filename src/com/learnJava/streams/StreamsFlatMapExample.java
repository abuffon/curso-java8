package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printStudentActivities() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
			.map(Student::getActivities) //Stream<List<String>>
			.flatMap(List::stream) //Stream<String>
			.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(printStudentActivities());
	}
}
