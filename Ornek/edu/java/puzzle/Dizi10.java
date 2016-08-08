package edu.java.puzzle;

import java.util.Arrays;

public class Dizi10 {

	public static void main(String[] args) {
		int i;
		int[] dizi = { 213, 69, 25, 112 };
		Arrays.sort(dizi);
		for (i = 0; i < dizi.length; i++)
			System.out.println(dizi[i]);
	}

}
