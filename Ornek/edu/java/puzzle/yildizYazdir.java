package edu.java.puzzle;

public class yildizYazdir {

	public static void main(String[] args) {
		int c = 0;
		int b = 5;

		for (int i = b; i >= c; i--) {
			for (int j = c; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}