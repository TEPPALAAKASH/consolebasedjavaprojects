package methods;

import java.util.Scanner;

public class Areass {
	static float areaoftriangle(float b, float h) {
		float at = 0.5f * b * h;
		return at;

	}
	static int areaofrectangle(int le,int br) {
		int ar=le*br;
		return ar;
	}
	static double areaofcircle(double r) {
		double ac = Math.PI * r * r;
		return ac;
	}
	static int areaofsquare(int s) {
	int as=s*s;
	return as;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******area of triangle*******");
		System.out.println("breadth of triangle=");
		float b = sc.nextFloat();
		System.out.println("height of triangle=");
		float h = sc.nextFloat();
		float at = areaoftriangle(b, h);
		System.out.println("area of triangle=" + at);
		System.out.println("----------------------------------------------");
		System.out.println("*******area of rectangle*******");
		System.out.println("breadth of rectangle=");
		int br=sc.nextInt();
		System.out.println("length of triangle=");
		int le=sc.nextInt();
		int ar = areaofrectangle(le, br);
		System.out.println("area of rectangle=" + ar);
		System.out.println("----------------------------------------------");
		System.out.println("*******area of circle*******");
		System.out.println("raduis of circle=");
		int r=sc.nextInt();
		double ac = areaofcircle(r);
		System.out.println("area of rectangle=" + ac);
		System.out.println("----------------------------------------------");
		System.out.println("*******area of square*******");
		System.out.println("side of square=");
		int s=sc.nextInt();
		int as = areaofsquare(s);
		System.out.println("area of rectangle=" + as);
		System.out.println("----------------------------------------------");
		sc.close();
	}

}
