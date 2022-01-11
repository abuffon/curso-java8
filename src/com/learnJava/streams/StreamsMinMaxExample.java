package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static int maxValue(List<Integer> list) {
		return list.stream()
			.reduce(0, (x, y) -> x > y ? x : y);
	}
	
	public static Optional<Integer> maxValueOptional(List<Integer> list) {
		return list.stream()
			//.reduce(0, (x, y) -> x > y ? x : y);
			.max(Integer::compareTo);
	}
	
	public static Optional<Integer> minValueOptional(List<Integer> list) {
		return list.stream()
			//.reduce(0, (x, y) -> x > y ? x : y);
			.min(Integer::compareTo);
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6,7,8,9,10);
		
		System.out.println(maxValue(list));
		
		Optional<Integer> max = maxValueOptional(list);
		if (max.isPresent())
			System.out.println(max.get());
		
		Optional<Integer> min = minValueOptional(list);
		if (min.isPresent())
			System.out.println(min.get());
	}

}
