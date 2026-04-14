package methods;

import java.util.Scanner;

public class Onlinedelivery {

	static double calculateitemtotal(double price, double quantity) {
		double a = price * quantity;
		return gstamount(a);

	}

	static double gstamount(double a) {
		double aftergst = (a * 5 / 100) + a;
		System.out.println("after adding 4% ofgst=" + aftergst);
		return delivery(aftergst);
	}

	static double delivery(double total) {
		double afterdelivery = total + 40;
		System.out.println("after delivery amount(40 ruppes)=" + afterdelivery);
		totalamount(afterdelivery);
		return afterdelivery;
	}

	static void totalamount(double bill) {
		System.out.println("total bill=" + bill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price of order=");
		double price = sc.nextDouble();
		System.out.println("enter quantity=");
		double quantity = sc.nextDouble();
		calculateitemtotal(price, quantity);
		sc.close();

	}

}
