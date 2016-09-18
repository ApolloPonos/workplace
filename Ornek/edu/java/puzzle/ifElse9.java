package edu.java.puzzle;

public class ifElse9 {

	public static void main(String[] args) {
	
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " sayısı 2'nin katıdır. ");
			} else if (i % 3 == 0) {
				System.out.println(i + " sayısı 3'ün katıdır ");
			} else
				System.out.println(i + " sayısı 2'nin ve 3'ün katı değildir.");
		}
	}

}
