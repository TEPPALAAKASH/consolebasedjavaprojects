package com.consolebasedproject;

import java.util.Random;
import java.util.Scanner;

public class Randomnumbers {

	public static void main(String[] args) {
		Random r =new Random();
		int num =r.nextInt(10);
		Scanner sc=new Scanner(System.in);
		int i=1;
		do {
			System.out.println("guess the number");
			int guess=sc.nextInt();
			if(num==guess) {
			System.out.println("WIN THE GAME");
			break;
			}else if(num<guess) {
				System.out.println("you have to guess greater that number  to WIN");
			}else {
				System.out.println("you hava to guess lesser that numbetr to WIN");
			}
			i++;
			if(i==4)
				System.out.println("****************GAME OVER******************8");
		}while(i<=3);
sc.close();
	}

}

