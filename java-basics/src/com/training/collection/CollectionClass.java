package com.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.training.adi.Employee;

public class CollectionClass {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(25);
//		myList.add("Hello");
//		myList.add(new Employee(106, "Rohan", "HR", 30000));
		myList.add(125);
		myList.add(225);
		Iterator<Integer> it = myList.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
//		System.out.println(myList);
	}
}
