package com.training.adi;

//extending abstract class makes derived class abstract
public class SBI extends DomesticBank implements Bank{
//after overriding, SBI class is no longer abstract
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 6.5;
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

}
