package com.training.java8;

import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;

public class StreamDemo {
	//Stream API
		//1. Intermediate operation(s) - multiple
		//2. Terminal operation - terminate the stream - one
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> numbers = Arrays.asList(10, 23, 15, 17, 21, 20, 12);
//		Stream<Integer> numStream = numbers.stream();
//		numStream.filter(x -> x > 15).map(n -> n * n).forEach(t -> System.out.println(t));
//		
		
		Arrays.asList("Sonali", "Shyam", "Amit", "Rohan", "Shikhar", "Shaw", "Aman")
				.stream()
				.filter(s -> s.charAt(0) == 'S')
				.map(x -> x.concat(" Bye"))
				.sorted()
				.forEach(System.out::println);
		//collect
		//method reference -> System.out::println
		
		
		
		
	}
}
