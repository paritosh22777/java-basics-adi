package com.assignment;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String department;
	private double salary;
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e) {
		return this.getName().compareTo(e.getName());		
		
		/* Sorting according to id:
		 * if(this.getEmpID() < e.getEmpId()){return -1;}
		 * else if(this.getEmpId() > e.getEmpId()){return 1;}
		 * else return 0;
		 **/
	}
}