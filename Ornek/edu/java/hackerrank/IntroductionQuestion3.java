package edu.java.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IntroductionQuestion3 {

	public static void main(String[] args) {

		// If is odd, print Weird
		// If is even and in the inclusive range of 2 to 5 print Not Weird
		// If is even and in the inclusive range of 6 to 20 print Weird
		// If is even and greater than 20, print Not Weird

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			if (n % 2 == 0 && n >= 2 && n <= 5) {
				ans = "Not Weird";
			} else {
				if (n % 2 == 0 && n >= 6 && n <= 20) {
					ans = "Weird";
				} else {
					if (n % 2 == 0 && n >= 20) {
						ans = "Not Weird";
					}
				}
			}
		}
		System.out.println(ans);
	}
}
