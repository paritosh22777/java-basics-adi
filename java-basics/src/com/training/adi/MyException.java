package com.training.adi;

// when extends Exception is used, MyException becomes checked exception.
public class MyException extends Exception{
	MyException(String msg)	{
		super(msg);
	}
}	
