package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
	
	public static void main(String[] args) {
		System.out.println(binaryOperator.apply(8, 5));
		
		BinaryOperator<Integer> maxByOperator = BinaryOperator.maxBy(comparator);
		System.out.println(maxByOperator.apply(8, 5));
		
		BinaryOperator<Integer> minByOperator = BinaryOperator.minBy(comparator);
		System.out.println(minByOperator.apply(8, 5));
	}

}
