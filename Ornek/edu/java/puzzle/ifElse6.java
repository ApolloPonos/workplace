package edu.java.puzzle;

import java.util.Scanner;

public class ifElse6 {

	private static final int GECME_NOTU = 45;

	public static void main(String[] args) {
		Scanner notAl = new Scanner(System.in);
		System.out.printf("Notunuzu girin");
		int not = notAl.nextInt();
		if (not < GECME_NOTU) {
			System.out
					.printf("Bu dersten kaldınız. Daha çok çalışmanız gerekiyor");
		} else {
			System.out.printf("Bu dersten geçtiniz. Tebrikler");
		}
	}
}
