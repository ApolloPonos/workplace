//Girilen sayiyi dizide sirasina yerlestiren program

package edu.java.course.intro;

import java.util.Scanner;

public class Kurs12 {

	public static void main(String[] args) {
		int a[] = { 1, 5, 12, 15, 19, 28, 35, 46, 53, 60, 0 };
		int i = 0;
		int k;
		int n = 17;
		int size = 11;

		if (n >= a[size - 2])
			a[size - 1] = n;

		else
			i = 0;

		while (n >= a[i])
			i = i + 1;

		for (k = size - 2; k >= i; k++) {
			a[k + 1] = a[k];
			a[i] = n;{

		}
		for (i = 0; i < size; i++)
			System.out.println(a[i] + " ");
	
}
}
}