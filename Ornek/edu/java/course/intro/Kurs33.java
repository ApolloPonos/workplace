package edu.java.course.intro;

import java.util.Random;

public class Kurs33 {

	public static void main(String[] args) {
		int i;
		int n;
		int k;
		int size;

		size = 5;
		k = 0;

		int a[] = { 0, 0, 0, 0, 0, 0 };
		int b[] = { 16, 22, 64, 96, 100 };

		for (i = 1; i < 50; i++) {
			Random r = new Random();
			n = r.nextInt(100);
			while (n >= b[k])
				k = k + 1;
			a[k] = a[k] + 1;

		}
		for (i = 0; i < size; i++)
			if (i == 0)
				System.out.println(0);
			else
				System.out.println((b[i - 1]));
		System.out.println("<=n<" + b[i] + " : " + a[i]);
	}
}