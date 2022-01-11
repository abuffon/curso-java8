package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsReduceExample {
	
	public static int mutiplication(List<Integer> list) {
		return list.stream().reduce(1, (a, b) -> a * b);
	}
	
	public static Optional<Integer>  mutiplicationWithoutIdentity(List<Integer> list) {
		return list.stream().reduce((a, b) -> a * b);
	}

	public static Optional<Student> getHighestGpaStudent() {
		return StudentDataBase.getAllStudents().stream()
			.reduce((s1,s2) -> {
				if (s1.getGpa() > s2.getGpa())
					return s1;
				else
					return s2;
			});
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,3,5,7);
		
		System.out.println(mutiplication(integers));
		
		System.out.println(mutiplicationWithoutIdentity(integers));
		
		Optional<Student> highestGpaStudent = getHighestGpaStudent();
		if (highestGpaStudent.isPresent())
			System.out.println(highestGpaStudent.get());
	}

}
