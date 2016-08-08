package edu.java.puzzle;

public class forDongusu7 {

	public static void main(String[] args) {

		int y;
		int[] dizi = new int[5];
		for (int i = 0; i < 5; i++) {
			dizi[i] = 3 * i + i * i;
		}

		y = 1;
		for (int i : dizi) {
			System.out.println("Dizinin" + y + " . elemani = " + i);
		}
	}

}
