package edu.java.course.intro;

public class Kurs22 {

	public static void main(String[] args) {
		
		int a[] = { 4, 8, 3, 1, 18, 5, 21, 20, 5, 17 };
		
		int i;
		int size;
		int max1;
		int max2;
		
		size = 10;
		max1 = a[0];
		max2 = a[1];

		for (i = 1; i < size; i++)
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			} else if (a[i] > max2)
				max2 = a[i];
		System.out.println(max2);
	}
}
