package edu.java.puzzle;
public class forDongusu2 {



	public static void main(String args[]) {
		int altcizgi, i, j;
		System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
		for (altcizgi = 1; altcizgi <= 70; altcizgi++) {
			System.out.print("_");
		}
		System.out.println();
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " | ");
			for (j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

}
