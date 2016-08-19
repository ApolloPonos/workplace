package edu.java.puzzle;

public class Fonksiyon3 {

	static String adi, soyadi;

	public static void main(String[] args) {

		degerAl("Apollo", "Ponos");
		yazdir();

	}

	static void degerAl(String ad, String soyad) {
		adi = ad;
		soyadi = soyad;
	}

	static void yazdir() {
		System.out.println("Tam isim:" + adi + " " + soyadi);
	}
}
