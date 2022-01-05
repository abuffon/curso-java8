package com.learnJava.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Student> supplier = () -> {
			return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
		};
		
		System.out.println(supplier.get());
		
		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
		System.out.println(listSupplier.get());
	}

}
