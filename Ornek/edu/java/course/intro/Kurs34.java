package edu.java.course.intro;

import java.util.Random;

public class Kurs34 {

	public static void main(String[] args) {
		int i;
		int n;
		int size;

		double countAdd;
		double countEven;

		countAdd = 0;
		countEven = 0;
		size = 100000;

		for (i = 0; i < size; i++) {
			Random r = new Random();
		n = r.nextInt(2);
		
		   if
		   (n%2)
				countAdd++;
		   
			else
				(n%1)
				countEven++;
		System.out.println(countAdd/size);
		System.out.println(countEven/size);
		}

	}
}
