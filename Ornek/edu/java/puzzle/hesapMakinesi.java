package edu.java.puzzle;

import java.util.*;

public class hesapMakinesi {
	public static void main(String args[]) {

		Scanner oku = new Scanner(System.in);
		int sayi1, sayi2, sonuc, islem;
		System.out.println("Toplama islemi icin 1, cikarma islemi icin 2, carpma islemi icin 3, bolme islemi icin 4 yazınız:");
		islem = oku.nextInt();
		System.out.println("Sayi1'yi giriniz:");
		sayi1 = oku.nextInt();
		System.out.println("sayi2'yi giriniz:");
		sayi2 = oku.nextInt();

		if (islem == 1) {
			sonuc = sayi1 + sayi2;
			System.out.println("Toplama islemi sonucu :" + sonuc);
		}
		if (islem == 2) {
			sonuc = sayi1 - sayi2;
			System.out.println("cikarma islemi sonucu :" + sonuc);
		}
		if (islem == 3) {
			sonuc = sayi1 * sayi2;
			System.out.println("carpma islemi sonucu :" + sonuc);
		}
		if (islem == 4) {
			sonuc = sayi1 / sayi2;
			System.out.println("bölme islemi sonucu :" + sonuc);
		}
	}

}
