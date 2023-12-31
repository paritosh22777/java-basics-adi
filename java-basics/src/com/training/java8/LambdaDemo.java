package com.training.java8;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10, b = 20;
//		sum(a, b);
		//MyInterface obj = (x, y) -> x+y;
		//System.out.println(obj.getSum(30, 20));
		
//		StringCompareInterface obj = (s1, s2) -> s1.equals(s2);
//		if(obj.compareStrings("Hello", "Hello"))
//			System.out.println("Equal strings");
//		else System.out.println("Not equal strings");
//		String str = "hello";
		Predicate<String> obj =  str -> str.equals("Hello");
		System.out.println(obj.test("Hello"));
		
		BiConsumer<String, String> obj1 = (s1, s2) -> System.out.println(s1 + " " + s2);
		obj1.accept("Hello", "World");
	}
	
	
	
//	private static int sum(int x, int y) {
//		return x + y;
//	}

}
