package edu.java.course.intro;

public class Kurs19 {

	public static void main(String[] args) {
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		int b[] = { 8, 13, 6, 12, 4, 5, 19, 1, 14, 25 };

		int i;
		int size;
		int n;
		int sum;

		size = 20;
		sum = 0;
		n = 7;
		for (i = 0; i < size;)
			if (n == a[i])
				b[i] = 1;
		for (i = 0; i < size; i++)
			sum = sum + b[i];
		System.out.println(n);
	}
}
