package edu.java.course.intro;

import java.util.Random;

public class Kurs30 {

	public static void main(String[] args) {
		
		int i;
		int a;
		int countEven = 0;
		int countAdd = 0;
		
		for (i = 1; i < 1000; i++) {

			Random r = new Random();
			a = r.nextInt(10);
			if (a % 2 == 0)
				countEven++;
			else
				countAdd++;

			System.out.println(countEven);
			System.out.println(countAdd);
		}
	}
}