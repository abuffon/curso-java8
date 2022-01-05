package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> unaryOperator = (s) -> s.concat("_default");
	
	public static void main(String[] args) {
		System.out.println(unaryOperator.apply("java8"));
	}

}
