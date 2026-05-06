package com.consolebasedproject;

import java.util.Scanner;

public class Loan {

		Scanner sc=new Scanner(System.in);
	String getaddressdeatils() {
		String address=null;
		System.out.println("enter your house no");
		String hno=sc.next();
		System.out.println("enter your street name");
		String strno=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter pincode");
		long pcode=sc.nextLong();
		address="house no"+hno+", street no"+strno+", city"+city+", pincode"+pcode;
		return address;
		
	}
	public boolean panValid() {
		System.out.println("enter pan card no");
		String pan =sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
	public boolean aadharValid() {
		System.out.println("enter aadhar card no");
		String pan =sc.next();
		return pan.matches("[0-9]{12}");
	}
	public boolean phoneNumValid() {
		System.out.println("enter phone  no");
		String pan =sc.next();
		return pan.matches("[0-9]{10}");
	}
	double rateOfInterest() {
		return 13.5;
	}
	int getCibilScore() {
		System.out.println("enter cibilscore");
		int cibil=sc.nextInt();
		return cibil;
	}
	int getAge() {
		System.out.println("enter age");
		int age=sc.nextInt();
		return age;
	}
	double getSalary() {
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		return salary;
	}
	

}
