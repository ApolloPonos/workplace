//DIZIDE KI HER SAYIDAN KAC TANE OLDUGUNU EKRANA YAZDIRAN PROGRAM
package edu.java.course.intro;

import java.lang.ArrayIndexOutOfBoundsException;

public class Kurs18 {

	public static void main(String[] args) {

		int a[] = { 5, 5, 5, 7, 8, 5, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 5 };
		int i;
		int k;
		int size;
		int flag;
		int count = 0;

		size = 20;
		for (i = 0; i < size; i++) {
			flag = 0;
			for (k = 0; k < i; k++)
				if (a[i] == a[k])
					flag = 1;

			if (flag == 0)
				count = 1;
			for (k = i + 1; k < size; k++)
				if (a[i] == a[k])
					count = count + 1;
			System.out.println(a[i] + " " + count);
		}

	}
}
