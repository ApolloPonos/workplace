package com.org.String;

public class String5 {

	public static void main(String[] args) {
		String s1 = "Edirne";
		String s2 = "Istanbul";
		String s3 = "Edirne";
		String s4 = "ISTANBUL";

		System.out.println(s1 + " - " + s2 + " = " + s1.equals(s2));
		System.out.println(s2 + " - " + s4 + " = " + s2.equals(s4));
		System.out.println(s1 + " - " + s3 + " = " + s1.equals(s3));
		System.out.println(s2 + " - " + s4 + " = " + s2.equalsIgnoreCase(s4));

	}

}
