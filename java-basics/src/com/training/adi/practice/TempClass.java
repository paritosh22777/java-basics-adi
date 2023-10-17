package com.training.adi.practice;

public class TempClass {
	public static void main(String[] args)
	{
		SavingsAccount sa = new SavingsAccount(20000, 5);
		CheckingAccount ca = new CheckingAccount(20000, 5);
		sa.message();
		ca.message();
	}
}
