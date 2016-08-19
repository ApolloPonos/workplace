package edu.java.puzzle;

public class odevAsalsayilar {

	static void ilkFonksiyonum(int a) {

		System.out.println("Ilk fonksiyonum calisti");

		for (int i = 0; i < a; i++)
			System.out.println("Dongudesin");

	}

	static void isPrime(int a) {

		int sayi = 5, x = 0;

		for (int i = 2; i <= sayi / 2; i++)
			if (sayi % i == 0) {
				x++;
				break;

			}
		if (x == 1)
			System.out.println(sayi + " sayısı asal sayıdır.");
		else
			System.out.println(sayi + " sayısı asal sayı değildir.");
	}

	static void yildizYazdir(int a) {
		int c = 0;
		int b = 5;

		for (int i = b; i >= c; i--) {
			for (int j = c; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {

		isPrime(4);
		yildizYazdir(5);

	}

}
