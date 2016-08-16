package edu.java.course.intro;

import java.util.Random;

public class Kurs35 {

	public static void main(String[] args) {
		int n;
		int i;
		int head = 0;
		int tail;
		int ratio;

		for (i = 0; i < 1000000; i++) {

			Random r = new Random();
			n = r.nextInt(2);
			head = head + n;

			tail = 1000000 - head;

	 		ratio = head / 1000000;
			System.out.println("Tura gelme ihtimali" + ratio);
			ratio = tail / 1000000;
			System.out.println("Yazi gelme ihtimali" + ratio);
		}
	}
}