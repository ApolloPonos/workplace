package edu.java.puzzle;

public class Training2 {

	public static void main(String[] args) {

		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = i++;
		System.out.println(a[2]);
		if (a[2] == 2)
			System.out.println("esit");
		else
			System.out.println("esit degil");

	}
}