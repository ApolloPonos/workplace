//10'DAN KUCUK URETILEN 1000 ADET RANDOM SAYININ KACININ TEK KACININ CIFT OLDUGUNU BULAN PROGRAM

package edu.java.course.intro;

import java.util.Random;

public class Kurs31 {

	public static void main(String[] args) {

		int even;
		int a;
		int add;
		add = 0;
		int i;

		for (i = 1; i < 1000; i++) {

			Random r = new Random();
			a = r.nextInt(10);
			System.out.println(a);
			add = add + a % 2;
		}

		even = 1000 - add;
		System.out.println("Tekler :" + add + "Ciftler :" + even);

	}
}