package com.consolebasedproject;

import java.util.Scanner;

public class Personalloan extends Loan{
	Scanner sc=new Scanner(System.in);
	
	void getPersonalloan() {
		System.out.println("All documents are submitted successfully");
	}

	public static void main(String[] args) {

		System.out.println("Welcone to Nivas secter banking");
		Personalloan p=new Personalloan();
		
		int cibil=p.getCibilScore();
		int age=p.getAge();
		double salary=p.getSalary();
		
		if(cibil>=750&&salary>=1000000.00 && age>20&&
				p.aadharValid()&&p.panValid()&&p.phoneNumValid()) {
			System.out.println("CONGRATULATIONS!!!  YOUR LOAN AS APPROVED");
			System.out.println("your personal loan ROI is "+p.rateOfInterest());
			System.out.println("As entered confiriming your details :");
			System.out.println(p.getaddressdeatils());
			p.getPersonalloan();
		}else {
			System.out.println("SORRY!!!! YOUR LOAN IS REJECTED......");
		}
	}

}
