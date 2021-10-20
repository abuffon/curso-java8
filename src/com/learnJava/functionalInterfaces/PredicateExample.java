package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	static Predicate<Integer> p = (i) -> {return i%2==0;};
	//=
	static Predicate<Integer> p1 = (i) -> i%2==0;
	static Predicate<Integer> p2 = (i) -> i%5==0;
	
	public static void predicateAnd() {
		System.out.println("and 10 : " + p1.and(p2).test(10));//predicate chaining
		System.out.println("and 9 : " + p1.and(p2).test(9));//predicate chaining
	}
	
	public static void predicateOr() {
		System.out.println("or 10 : " + p1.or(p2).test(10));//predicate chaining
		System.out.println("or 8 : " + p1.or(p2).test(8));//predicate chaining
	}
	
	public static void predicateNegate() {
		System.out.println("negate 8 : " + p1.or(p2).negate().test(8));//predicate chaining
	}

	public static void main(String[] args) {
		System.out.println(p.test(4));
		System.out.println(p1.test(4));
		
		predicateAnd();
		predicateOr();
		predicateNegate();
	}
}
