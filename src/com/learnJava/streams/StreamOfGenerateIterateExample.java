package com.learnJava.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String[] args) {

		Stream<String> ss = Stream.of("adam", "dan", "julie");
		ss.forEach(System.out::println);
		
		Stream.iterate(1, x -> x * 2)
			.limit(10)
			.forEach(System.out::println);
		
		Supplier<Integer> supplier = new Random()::nextInt;
		Stream.generate(supplier)
			.limit(10)
			.forEach(System.out::println);;
	}

}
