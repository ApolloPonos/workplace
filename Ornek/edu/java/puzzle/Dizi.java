package edu.java.puzzle;

public class Dizi {
	public static void main(String[] args) {
		int i, size = 10;
		int c = 0;
		int sum = 0;
		
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		for (i = 0; i < size; i = i + 1)
			if (a[i] % 2 != 1) {
				c = c + 1;
				sum = sum + a[i];

				System.out.println(a[i]);

			}
		
		
		System.out.println("cift sayi adedi=" + c);
		System.out.println("cift sayilarin toplami=" + sum);
		
	}
}
