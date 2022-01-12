package com.learnJava.streams;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class SteramsFindExample {

	public static Optional<Student> findFirst() {
		return StudentDataBase.getAllStudents().parallelStream()
				.filter(s -> s.getGender().equals("female"))
				.findFirst();
	}
	
	public static Optional<Student> findAny() {
		return StudentDataBase.getAllStudents().parallelStream()
				.filter(s -> s.getGender().equals("female"))
				.findAny();
	}
	
	public static void main(String[] args) {
		Optional<Student> findFirst = findFirst();
		if (findFirst.isPresent())
			System.out.println(findFirst.get());
		
		Optional<Student> findAny = findAny();
		if (findAny.isPresent())
			System.out.println(findAny.get());

	}

}
