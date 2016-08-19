package edu.java.puzzle;

public class Fonksiyon {

	static int x, y;

	public static void main(String[] args) {
		int a = 5, b = 2;

		islem(a, b);
		yaz();
	}

	static void islem(int a, int b) {
		x = a;
		y = b;
	}

	static void yaz() {
		System.out.println("x degeri : " + x);
		System.out.println("y degeri : " + y);
	}
}
