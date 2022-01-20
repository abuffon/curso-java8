package com.learnJava.streams_terminal;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsSumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents()
			.stream()
			.collect(Collectors.summingInt(Student::getNotenook));
	}
	
	public static double avg() {
		return StudentDataBase.getAllStudents()
			.stream()
			.collect(Collectors.averagingInt(Student::getNotenook));
	}
	
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(avg());
	}

}
