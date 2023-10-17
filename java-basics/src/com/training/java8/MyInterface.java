package com.training.java8;

// to force compiler that functional interface is valid.
@FunctionalInterface
public interface MyInterface {
	public int getSum(int a, int b);
//	public void display();
}
//Functional interface: only one abstract method