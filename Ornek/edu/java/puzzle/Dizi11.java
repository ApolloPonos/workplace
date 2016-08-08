package edu.java.puzzle;

import java.util.Arrays;

public class Dizi11 {

	public static void main(String[] args) {

		int dizi[] = { 3, 4, 12, 9, 4, 7 };
		
		Arrays.sort(dizi);
		int deger = Arrays.binarySearch(dizi, 12);
		if (deger < 0)
			System.out.println("Bulunamadi");
		else
			System.out.println("Bulundu ve indisi :" + deger);

	}

}
