package edu.java.puzzle;

public class Fonksiyon4 {

	double delta = b * b - 4 * a * c;

	public static void main(String[] args) {
		kokBul(1, 0, -9);
	}

	static void kokBul(int a, int b, int c) {
		if (delta > 0) {

			double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
			double x2 = ((-b - Math.sqrt(delta)) / (2 * a));

			System.out.println(" 2 kok var kokler :" + x1 + " ve " + x2);
		} else if (delta == 0) {
			double x1 = (-b) / (2 * a);

			System.out.println(" 1 adet kok var :" + +x1);
		} else if (delta < 0)
			System.out.println("Kok yok");
	}
}
