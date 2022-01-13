package com.learnJava.numericsstreams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericsStreamsExample {

	public static int sumOfNumbers(List<Integer> list) {
		return list.stream()
				.reduce(0, (x, y) -> x + y);
				//.reduce(Integer::sum);
	}
	
	public static int sumOfNumbersIntStream() {
		return IntStream.rangeClosed(1, 6).sum();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(sumOfNumbers(list));
		System.out.println(sumOfNumbersIntStream());
		
		System.out.println("\n");
		System.out.println("count = " + IntStream.range(1, 5).count());// or LongStream
		IntStream.range(1, 5).forEach(i -> System.out.print(i + ","));
		
		System.out.println("\n");
		System.out.println("count = " + IntStream.rangeClosed(1, 5).count());// or LongStream
		IntStream.rangeClosed(1, 5).forEach(System.out::print);
		
		System.out.println("\n");
		System.out.println("count = " + IntStream.range(1, 5).asDoubleStream().count());// or LongStream
		IntStream.range(1, 5).asDoubleStream().forEach(i -> System.out.print(i + ","));
		
		System.out.println("\n");
		System.out.println("sum = " + IntStream.range(1, 5).sum());// or LongStream
		
		System.out.println();
		OptionalInt min = IntStream.range(1, 5).min();
		System.out.println("min = " + (min.isPresent() ? min.getAsInt() : " err "));// or LongStream
		
		System.out.println();
		OptionalLong max = LongStream.range(1, 5).max();
		System.out.println("max = " + (max.isPresent() ? max.getAsLong() : " err "));// or IntStream
		
		System.out.println();
		OptionalDouble average = LongStream.range(1, 5).average();
		System.out.println("average = " + (average.isPresent() ? average.getAsDouble() : " err "));// or IntStream
	}

}
