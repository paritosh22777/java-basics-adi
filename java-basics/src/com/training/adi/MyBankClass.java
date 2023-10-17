package com.training.adi;

public class MyBankClass {
	public static void main(String[] args) {
		Person emp ;
		Bank bank1 = new SBI();// do it in factory design pattern
		bank1.getInterestRate();
	}
}
