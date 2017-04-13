package edu.java.puzzle;

public class top {
	public static void main(String[] args) {
		ZigZag(4);
	}

	public static void ZigZag(int n) {

		for (int a = 0; a < n; a++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("|");
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = i; j < 4; j++) {
					System.out.print(" ");
				}
				System.out.println("|");
			}

			for (int i = 1; i < 5; i++) {
				System.out.print("|");
				for (int j = 4; j > i; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = i; j > 0; j--) {
					System.out.print(" ");
				}
				System.out.println("|");
			}
		}

	}

}
