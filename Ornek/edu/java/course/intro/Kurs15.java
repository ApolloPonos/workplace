//GIRILEN SAYININ DIZI DE KAC TANE OLDUGUNU YAZDIRAN PROGRAM
package edu.java.course.intro;

public class Kurs15 {

	public static void main(String[] args) {
		int a[] = { 5, 5, 5, 7, 8, 5, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 5 };
		int size;
		int n;
		int i;
		int count;

		size = 20;
		n = 5;
		count = 0;

		for (i = 0; i < size; i++)

			if (n == a[i]) {
				count = count + 1;
				{
					System.out.println(n + "den dizi de" + count
							+ "adet vardir");

				}
			}
	}
}
