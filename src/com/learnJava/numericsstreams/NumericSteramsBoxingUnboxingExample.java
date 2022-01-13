package com.learnJava.numericsstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericSteramsBoxingUnboxingExample {

	public static List<Integer> boxing() {//int -> Integer
		return IntStream.rangeClosed(1, 10)
			.boxed()
			.collect(Collectors.toList());
	}
	
	public static int unboxing(List<Integer> list) {//Integer -> int
		return list.stream()
			.mapToInt(Integer::intValue)
			.sum();
	}
	
	public static void main(String[] args) {
		System.out.println("Boxing = " + boxing());
		List<Integer> boxing = boxing();
		System.out.println("Unboxing = " + unboxing(boxing));
	}

}
