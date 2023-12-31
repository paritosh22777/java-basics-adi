package com.training.adi;


//POJO = plain old java object
public class Employee extends Person{
//	private String empName; // camelCased
	private int empId;
	private String deptName;
	private double salary; // instance variables
	
	public Employee(int empId, String empName, String deptName, double salary) {
		this.empId = empId;
		this.name = empName;
		this.deptName = deptName;
		this.salary = salary;
	}
	public String getEmpName() {
		return name;
	}
	public void setEmpName(String empName) {
		this.name = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String getDetails() {
		return "Employee [empName=" + name;
	}
	public String toString() {
		return "\nEmployee Name: " + this.name + " Employee ID: " + this.empId + " Department name: " + this.deptName + " Salary: Rs. " + this.salary;
	}
	
}

// Primitive data types(fixed memory size): byte, short, int, float, double, long, char, boolean
// Non-primitive data types: String, Array, Class