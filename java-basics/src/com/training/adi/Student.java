package com.training.adi;

public class Student {
	private int rollNo;
	private String name;
	private char gender;
	private int marks;
	private int phoneNo;
	private String address;
	
	public Student(int rollNo, String name, char gender, int marks, int phoneNo, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", marks=" + marks + ", phoneNo=" + phoneNo
				+ ", address=" + address + "]";
	}
	
}
