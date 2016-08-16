//RANDOM URETILEN SAYILARIN HANGI ARALIKTA OLDUGUN BULAN PROGRAM

package edu.java.course.intro;

import java.util.Random;

public class Kurs32 {

	public static void main(String[] args) {
		
		int a[] = { 0, 0, 0, 0, 0, 0 };
		
		int i;
		int n;
		int size;
		size = 5;

		for (i = 0; i < 50; i++) {

			Random r = new Random();
			n = r.nextInt(100);
			a[n / 20] = a[n / 20] + 1;

		}
		for (i = 0; i < size; i++) {
			System.out.println((i * 20) + "<=n<" + (i + 1) * 20 + ":" + a[i]);
		}
	}

}
