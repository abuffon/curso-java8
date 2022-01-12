package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

public class SteramsMatchExample {

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
			.allMatch(s -> s.getGpa() >= 3.5);
	}
	
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
			.anyMatch(s -> s.getGpa() >= 4.1);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
			.noneMatch(s -> s.getGpa() >= 4.1);
	}
	
	public static void main(String[] args) {
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());
	}

}
