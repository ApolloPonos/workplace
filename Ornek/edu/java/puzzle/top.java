package edu.java.puzzle;

public class top {
	public static void main(String[] args) {
		ZigZag(2, 30);
	}

	public static void ZigZag(int n, int m) {

		for (int a = 0; a < n; a++) {
			for (int i = 0; i < m; i++) {
				System.out.print("|");
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = i; j < m-1; j++) {
					System.out.print(" ");
				}
				System.out.println("|");
			}

			for (int i = 1; i < m; i++) {
				System.out.print("|");
				for (int j = m-1; j > i; j--) {
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
