package com.training.adi;
//delete -> package com.training.adi -> to work using cmd

public class MyClass {
	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		emp1.setEmpName("David");
//		emp1.setEmpId(101);
//		emp1.setDeptName("Sales");
//		emp1.setSalary(200000);
		
		//Employee emp2 = new Employee(101, "Kevin", "Accounts", 200000);
//		System.out.println(emp1.getEmpName() + " " + emp1.getEmpId() + " " +  emp1.getDeptName() + " " + emp1.getSalary());
		//System.out.println(emp2.toString());
		
//		Student std1 = new Student(111, "Rohan", 'M', 89, 1234555555, "ABC Road");
//		Student std2 = new Student(112, "Priya", 'F', 90, 1234324555, "ADE Road");
//		System.out.println(std1.toString());
//		System.out.println(std2.toString());
		
		
		
//		String s1 = "hello";
//		String s2 = "hello";
//		String s3 = new String("hello");
//		String s4 = new String("hello");
//		s1 = "hello world";
//		System.out.println(s1 == s2);
//		System.out.println(s3==s4);
//		System.out.println(s3.equals(s4));
//		
		
		
		
		
		// each user defined class inherits from Object class 
		// public class Employee extends Object{}
		
//		
//		int[] marks = new int[10];
//		marks[0] = 10;
//		marks[1] = 10;
//		marks[2] = 10;
//		try {
//			if(marks[1] < 20) {
//				throw new MyException("Value cannot be less than 20");
//			}
//		}
//		catch(Exception e)
//		{
//			System.out.println("Exception occurred.");
//		}
//		marks[3] = 10;
//		marks[4] = 10;
//		marks[0] = 10;
//		marks[0] = 10;
//		marks[0] = 10;
//		marks[0] = 10;
//		marks[0] = 10;
//		System.out.println(marks[3]);
		
		
		
		
		
		
		
		
		
		//Parent class ref can point to child class object
//		Person emp = new Employee(101, "Kevin", "Accounts", 200000);
//		emp.getDetails();
//		Employee emp = new Employee()
		PermanentEmployee pEmp = new PermanentEmployee(105, "Kevin", "IT", 200000);
		System.out.println(pEmp.toString());
//		System.out.println("PF Percentage: " + pEmp.getPfPercentage());
//		System.out.println("PF Amount of Employee: " + pEmp.getPfAmount());
//		System.out.println("Net Salary of Employee: " + pEmp.getNetSalary());
	}
}
