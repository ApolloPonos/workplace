package edu.java.puzzle;

import java.util.Scanner;

public class ifElse7 {

	private static final int GECME_NOTU = 45;

	public static void main(String[] args) {

		Scanner notAl = new Scanner(System.in);
		System.out.printf("Notunuzu girin");
		int not = notAl.nextInt();
		if (not < GECME_NOTU) {
		
			System.out
					.printf("Bu dersten kaldınız. Daha çok çalışmanız gerekiyor");
	
		} 
		else {
			System.out.printf("Bu dersten geçtiniz. Tebrikler");
			if (not <= 60) {
				System.out.printf("Notunuz DD");
			} else if (not <= 70) {
				System.out.printf("Notunuz CC");
			} else if (not <= 85) {
				System.out.printf("Notunuz BB");
			} else {
				System.out.printf("Notunuz AA");
			}
		}

	}

}
