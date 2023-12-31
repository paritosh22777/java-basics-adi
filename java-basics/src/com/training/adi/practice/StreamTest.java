package com.training.adi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
				new Product(101, "Bread", "Bakery", 50),
				new Product(102, "Milk", "Dairy", 60),
				new Product(102, "Milk", "Dairy", 60),
				new Product(101, "Bread", "Bakery", 50),
				new Product(103, "Robot", "Toy", 700),
				new Product(104, "RC Car", "Toy", 1000),
				new Product(104, "RC Car", "Toy", 1000),
				new Product(104, "RC Car", "Toy", 1000),
				new Product(105, "Doll", "Toy", 400),
				new Product(106, "Biscuits", "Bakery",100),
				new Product(103, "Robot", "Toy", 700),
				new Product(103, "Robot", "Toy", 700),
				new Product(107, "Doll", "Toy", 600),
				new Product(108, "Curd", "Bakery", 50),
				new Product(103, "Robot", "Toy", 700)
				);
		List<Product> resList = productList.stream()
				.filter(x -> x.getProdCategory() == "Toy" && x.getPrice() > 500)
				.collect(Collectors.toList());
		//can also be done using set
		resList.stream()
		.distinct()
		.forEach(System.out::println);
	}
}
