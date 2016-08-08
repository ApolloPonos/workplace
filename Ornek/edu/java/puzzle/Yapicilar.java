package edu.java.puzzle;

public class Yapicilar {

	void metod1() {

		System.out.println("Parametre almayan metod cagirildi");
	}

	void metod2(int sayi1) {
		System.out.println("Parametre alan metod cagirildi");

	}

	public YapicilarOverloading() {
		metod1();
	}

	public YapicilarOverloading(int sayi1) {
		metod2(sayi1);
	}

	public static void main(String[] args) {
		YapicilarOverloading nesne1 = new YapicilarOverloading();
		YapicilarOverloading nesne2 = new YapicilarOverloading();

	}
}
