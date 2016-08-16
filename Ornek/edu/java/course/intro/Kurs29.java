//1000 TANE RANDOM SAYI URETEN PROGRAM

package edu.java.course.intro;

import java.util.Random;

public class Kurs29 {

	public static void main(String[] args) {
		int i;

		for (i = 1; i < 1000; i++) {

			Random r = new Random(); 
			int a = r.nextInt(10);
			System.out.print(a);
		}
	}
}