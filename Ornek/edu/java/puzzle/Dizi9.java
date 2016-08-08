package edu.java.puzzle;

public class Dizi9 {

	public static void main(String[] args) {
		int i;
		int[] dizi1 = { 1, 3, 5, 7, 9 };
		int[] dizi2 = new int[5];
		
		System.arraycopy(dizi1, 0, dizi2, 0, 5);
		for (i = 0; i < dizi2.length; i++)
			System.out.println("Yeni dizinin"+i+". "+ "elemani :" + dizi2[i]);

	}

}
