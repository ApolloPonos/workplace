package edu.java.hackerrank;

import java.io.*;
import java.util.*;

public class StringQuestion2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		String ters = new StringBuffer(A).reverse().toString();

		if (A.equals(ters)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
