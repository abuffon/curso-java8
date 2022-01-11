package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> list) {
		return list.stream()
			.limit(2)
			//.reduce((a,b)->a+b)
			.reduce(Integer::sum);
	}
	
	public static Optional<Integer> skip(List<Integer> list) {
		return list.stream()
			.skip(3)
			//.reduce((a,b)->a+b)
			.reduce(Integer::sum);
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6,7,8,9,10);

		Optional<Integer> limitOptional = limit(list);
		if (limitOptional.isPresent())
			System.out.println(limitOptional.get());
		
		Optional<Integer> skipOptional = skip(list);
		if (skipOptional.isPresent())
			System.out.println(skipOptional.get());
	}

}
