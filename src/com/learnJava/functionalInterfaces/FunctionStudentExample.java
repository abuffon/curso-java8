package com.learnJava.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class FunctionStudentExample {
	
	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
		Map<String, Double> studentGradeMap = new HashMap<>();
		
		students.forEach(s -> {
			if (PredicateStudentExample.p1.test(s))
				studentGradeMap.put(s.getName(), s.getGpa());
		});
		
		return studentGradeMap;
	});
	
	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
	}
}
