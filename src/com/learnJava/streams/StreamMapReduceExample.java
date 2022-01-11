package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {

	public static int numberOfNotebooks() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
			.filter(s -> s.getGradeLevel() >= 3)
			.filter(s -> s.getGender().equals("female"))
			.map(Student::getNotenook) //Stream<Integer>
			//.reduce(0, (a, b) -> a + b);
			.reduce(0, Integer::sum);
	}
	
	public static void main(String[] args) {
		System.out.println(numberOfNotebooks());
	}

}
