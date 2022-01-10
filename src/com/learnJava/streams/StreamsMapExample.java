package com.learnJava.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapExample {

	public static List<String> namesList() {
		return StudentDataBase.getAllStudents().stream()
					//Studente as an input -> Student name
					.map(Student::getName) //Stream<String>
					.map(String::toUpperCase) //Stream<String> -> uppercase on each input
					.collect(Collectors.toList()); //List<String>
	}
	
	public static Set<String> namesSet() {
		return StudentDataBase.getAllStudents().stream()
					//Studente as an input -> Student name
					.map(Student::getName) //Stream<String>
					.map(String::toUpperCase) //Stream<String> -> uppercase on each input
					.collect(Collectors.toSet()); //Set<String>
	}
	
	public static void main(String[] args) {
		System.out.println(namesList());
		System.out.println(namesSet());
	}
}
