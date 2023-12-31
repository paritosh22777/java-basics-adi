package com.training.adi.practice;

public class SavingsAccount implements Account {

	
	public double principal;
	public int time;
	
	
	SavingsAccount(double principal, int time){
		this.principal = principal;
		this.time = time;
	}
	
	@Override
	public double getInterestRate(double principal, int time) {
		// TODO Auto-generated method stub
		double interest = principal * 0.05 * time;
		return interest;
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		double interest = getInterestRate(principal, time);
		double amount = principal + interest;
		System.out.println("Interest: Rs. " + interest + "\nAmount: Rs. " + amount);
	}
}
