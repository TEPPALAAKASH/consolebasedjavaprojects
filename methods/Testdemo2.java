package methods;

public class Testdemo2 {
	static void sravss(int a, int b) {
		int c = a + b;
		System.out.println(c);
		nivas(c, 10);

	}

	static void nivas(int e, int c) {
		int d = e + c;
		System.out.println(d);
		Testdemo2 t = new Testdemo2();
		t.nitish(d, 20);

	}

	void nitish(int d, int f) {
		double g = f + d;
		System.out.println(g);
		nandhan(g, 20);

	}

	void nandhan(double g, int h) {
		double i = g + h;
		System.out.println(i);

	}

	public static void main(String[] args) {
		sravss(10, 20);

	}

}
