package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		//prior java 8
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
				// 0 -> o1 == o2
				// 1 -> o1 > o2
				// -1 -> o1 < o2
			}
		};
		
		System.out.println("Result: " + comparator.compare(3, 1));
		
		//lambda
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
		System.out.println("Result lambda: " + comparatorLambda.compare(3, 1));
		
		Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
		System.out.println("Result lambda 1: " + comparatorLambda1.compare(3, 1));
	}
}
