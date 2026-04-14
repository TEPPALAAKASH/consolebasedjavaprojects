package methods;

import java.util.Scanner;

public class Testmethod5 {

		String name;
		double accno;
		double pin;
		 static double balance;

	static double deposit(double a ,double balance) {
		
		return a+balance;
	}
	static double withdraw(double wd,double k) {
		return k-wd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Testmethod5 user1 = new Testmethod5();
		System.out.println("enter account holdername=");
		user1.name = sc.next();
		System.out.println("enter account number=");
		user1.accno=sc.nextDouble();
		System.out.println("enter pin=");
		user1.pin=sc.nextDouble();
		System.out.println("enter money=");
		Testmethod5.balance=sc.nextDouble();
		
		System.out.println("enter deposit balance=");
		double dp=sc.nextInt();
		double k=deposit (balance,dp);
		
		System.out.println("total money after deposit="+k);
		
System.out.println("enter withdraw money=");
double wd=sc.nextDouble();
withdraw(wd,k);
System.out.println("after withdraw="+withdraw(wd,k));
sc.close();
	}

}
