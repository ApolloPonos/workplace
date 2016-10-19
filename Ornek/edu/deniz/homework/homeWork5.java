package edu.deniz.homework;

public class homeWork5 {

	public static void main(String[] args) {
		int a[] = { 14, 45, 2, 5, 13, 7, 65, 4, 3, 22 };

		int n;
		int i;
		n = 7;
		int size = 10;
		for (i = 0; i < n; i = i + 1)
			a[size - n + i] = a[i];
		for (i = 0; i < size - n; i++)
			a[i] = 0;
		for (i = 0; i < size; i++)
			System.out.println(a[i]);
	}
}