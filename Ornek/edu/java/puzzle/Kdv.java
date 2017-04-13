package edu.java.puzzle;

public class Kdv {
	public static void main(String[] args) {

		int i = 1000;
		int kdv = (int) (i * .18);
		kdv = kdv + i;
		System.out.println(kdv);
		System.out.println(i = (int) (i * .18));
	}
}
