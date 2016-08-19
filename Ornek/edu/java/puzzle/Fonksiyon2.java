package edu.java.puzzle;

public class Fonksiyon2 {
	static int buyuksayi;

	public static void main(String[] args) {
		int x = hesapla(7, 12);
		System.out.println("Buyuk olan sayi :" + x);

	}

	static int hesapla(int a, int b) {
		if (a > b)
			buyuksayi = a;
		else if (a < b)
			buyuksayi = b;
		return buyuksayi;
	}
}
