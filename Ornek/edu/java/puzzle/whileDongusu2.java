package edu.java.puzzle;

public class whileDongusu2 {

	public static void main(String[] args) {

		int i;
		int j;
		int k;

		i = 10;
		j = 0;
		k = 0;
		while (i > j) {
			System.out.println("i, j den buyuk");
			i -= 2;
			j += 2;
			k++;

		}
		System.out.println("Artik buyuk degil");
		System.out.println("Bu dongu " + k + "kere dondu");
	}

}
