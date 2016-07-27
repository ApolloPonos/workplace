package Kurs;

import java.util.Scanner;

public class Kurs11 {

	public static void main(String[] args) {
		int toplam = 0;
		System.out.println("Lütfen 5 sayi giriniz: ");
		Scanner s = new Scanner(System.in);
		int i = 1;
		while (i < 6) {

			System.out.println(i + ". sayiyi giriniz: ");
			int sayi = s.nextInt();
			toplam += sayi;
			i++;
		}
		System.out.println("Girdiginiz sayilarin toplami = " + toplam);
	}
}