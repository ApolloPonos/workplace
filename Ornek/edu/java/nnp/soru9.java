package edu.java.nnp;

public class soru9 {

	public static void main(String[] args) {
		int baslangic = 0;
		int bitis = 10;
		for (int i = baslangic; i <= bitis; i++) {
			for (int j = baslangic; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}