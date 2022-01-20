package com.learnJava.streams_terminal;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMappingExample {

	public static List<String> mapping() {
		return StudentDataBase.getAllStudents()
			.stream()
			.collect(Collectors.mapping(Student::getName, 
					Collectors.toList()));//toSet...
	}
	
	public static void main(String[] args) {
		System.out.println(mapping());
	}

}
