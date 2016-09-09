package edu.java.hackerrank;

import java.io.*;
import java.util.*;

public class StringQuestion3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		int result = A.length() + B.length();

		String Ailk = String.valueOf(A.charAt(0));
		String Bilk = String.valueOf(B.charAt(0));

		Ailk = Ailk.toUpperCase();
		Bilk = Bilk.toUpperCase();

		String Asonrasi = A.substring(1);
		String Bsonrasi = B.substring(1);

		String sonA = Ailk + Asonrasi;
		String sonB = Bilk + Bsonrasi;

		System.out.println("" + result);
		int uzaklik = +A.compareTo(B);

		if (uzaklik > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.println("" + sonA + " " + sonB);

	}

}
