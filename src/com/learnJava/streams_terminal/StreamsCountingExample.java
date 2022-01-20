package com.learnJava.streams_terminal;

import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class StreamsCountingExample {

	public static long counting() {
		return StudentDataBase.getAllStudents()
			.stream()
			.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		System.out.println(counting());
	}

}
