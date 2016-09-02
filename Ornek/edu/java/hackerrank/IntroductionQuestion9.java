package edu.java.hackerrank;

import java.util.*;
import java.io.*;

public class IntroductionQuestion9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int sum = 0;
			sum = sum + a;

			for (int i = 0; i < c; i++) {

				sum = sum + (int) (Math.pow(2, i)) * b;
				System.out.print(sum + " ");

			}
			System.out.println();

			n--;

		}

	}

}
