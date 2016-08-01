package edu.java.puzzle;

import java.util.Scanner;

public class forDongusu5 {

	public static void main(String[] args) {
		int dersNotu = 0, toplam = 0, enb = 0, enk = 100;
		int ogrenciSayisi = 0, dersSayisi = 0;
		double ortalama = 0;
		Scanner giris = new Scanner(System.in);

		System.out.println("Kaç ders alıyorsun");
		dersSayisi = giris.nextInt();
		for (int i = 1; i < dersSayisi + 1; i++) {

			System.out.println(i + ". Ders Notunuzu Giriniz");
			dersNotu = giris.nextInt();
			System.out.println(i + ". notunuz: " + dersNotu);
			toplam += dersNotu;

			if (enb < dersNotu) {
				enb = dersNotu;
			}
			if (enk > dersNotu) {
				enk = dersNotu;
			}
			ortalama = (double) (toplam / dersSayisi);
		}
		System.out.println("Ortalama: " + ortalama);
		System.out.println("En Büyük: " + enb);
		System.out.println("En Küçük: " + enk);

	}

}
