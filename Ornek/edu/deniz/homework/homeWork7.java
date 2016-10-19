package edu.deniz.homework;

import java.util.Scanner;

public class homeWork7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz : ");
		int sayi = scanner.nextInt();
		if (sayi <= 1)
			System.out.println("1 den büyük pozitif tam sayılar asal olabilir ");
		else {
			for (int i = 2; i <= sayi; i++) {
				int kalan = sayi % i;
				if (kalan == 0) {
					System.out.println("ASAL SAYI DEGILDIR");
					break;
				}
				if (i == sayi - 1) {
					System.out.println("ASAL SAYIDIR");
					break;
				}

			}

		}

	}

}
