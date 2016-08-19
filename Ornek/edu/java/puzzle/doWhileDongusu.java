package edu.java.puzzle;

public class doWhileDongusu {

	public static void main(String[] args) {
		int x;
		int y;
		int i;

		x = 100;
		y = 40;
		i = 0;

		do {
			i++;
			x = x - 10;
			y = y + 10;

		} while (x > y);
		System.out.println(" Dongu " + i + "kere dondu");

	}
}