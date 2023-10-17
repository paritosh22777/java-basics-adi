package com.training.adi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EmployeeeCollection {
	public static void main(String[] args) {
//		ArrayList<Employee> employeeList = new ArrayList<>();
//		System.out.print("Enter number of employees: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while(n > 0) {
//			System.out.print("\nEnter employee id: ");
//			int id = sc.nextInt();
//			System.out.print("Enter employee name: ");
//			String name = sc.next();
//			System.out.print("Enter employee department: ");
//			String dept = sc.next();
//			System.out.print("Enter employee salary: ");
//			double sal = sc.nextDouble(); 
//			Employee emp = new Employee(id, name, dept, sal);
//			employeeList.add(emp);
//			n--;
//		}
//
//		ArrayList<Employee> resList = new ArrayList<>();
////		Iterator<Employee> it1 = employeeList.iterator();
//		for(Employee e : employeeList) {
//			if(e.name.charAt(0) == 'A')
//			{
////				System.out.println(it1.next());
//				resList.add(e);
//			}
//		}
////		System.out.println(resList.size());
//		Iterator<Employee> it2 = resList.iterator();
//		while(it2.hasNext()) {
//			System.out.println(it2.next());
//		}
//		//object has unique value
//		sc.close();
//		
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "Mark");
		mp.put(2, "Peter");
		mp.put(3, "Clara");
		mp.put(4, "Sara");
		
		for (Map.Entry<Integer, String> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
