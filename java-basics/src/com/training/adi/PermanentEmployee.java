package com.training.adi;

public class PermanentEmployee extends Employee{

	private double pfPercentage = 12;
	private double pfAmount = 0;
	private double netSalary = 0;
	
	public PermanentEmployee(int empId, String empName, String deptName, double salary) {
		super(empId, empName, deptName, salary);
	}
	
	public double getPfPercentage() {
		return pfPercentage;
	}
	
	public double getPfAmount() {
		pfAmount = 0.12 * getSalary();
		return pfAmount;
	}
	
	public double getNetSalary() {
		netSalary = getSalary() - pfAmount;
		return netSalary;
		
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\n\nPF percentage: " + getPfPercentage() + "%, PF Amount: Rs. " + getPfAmount() + ", Net Salary: Rs. " + getNetSalary();
	}
}
