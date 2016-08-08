package edu.java.puzzle;

public class Metodlar6 {

	static int buyuksayi;

	public static void main(String[] args) {
		int x = hesapla(7, 2);
		System.out.println("Buyu olan sayi:" + x);
	}

	static int hesapla(int a, int b) {
		if (a > b)
			buyuksayi = a;
		else if (a < b)
			buyuksayi = b;
		return buyuksayi;

	}

}
