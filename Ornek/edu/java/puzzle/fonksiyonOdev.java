package edu.java.puzzle;

import java.util.Scanner;

public class fonksiyonOdev {

	public static void main(String[] args) {
		int sayi = 4, x = 0;

		for (int i = 2; i <= sayi / 2; i++)
			if (sayi % i == 0) {
				x++;
				break;

			}
		if (x == 0)
			System.out.println(sayi + " sayısı asal sayıdır.");
		else
			System.out.println(sayi + " sayısı asal sayı değildir.");
	}

}