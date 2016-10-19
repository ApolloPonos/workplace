//Dizinin ilk n elemanini dizinin sonuna atayan ve basta olan elemanlari sifirlayan program.

package edu.deniz.homework;

public class homeWork6 {

	public static void main(String[] args) {
		int a[] = { 14, 45, 2, 5, 13, 7, 65, 4, 3, 22 };

		int n;
		int i;
		n = 4;

		int size = 10;
		for (i = 0; i < n; i = i + 1)
			a[size - 1 - i] = a[n - 1 - i];
		for (i = 0; i < size - n; i++)
			a[i] = 0;
		for (i = 0; i < size; i++)
			System.out.println(a[i]);
	}

}
