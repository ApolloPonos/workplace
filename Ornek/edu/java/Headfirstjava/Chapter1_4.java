package edu.java.Headfirstjava;

public class Chapter1_4 {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the loop");
		while (x < 4) {
			System.out.println("In the loop");
			System.out.println("Value of x is" + " "+ x);
			x = x + 1;
		}

		System.out.println("This is after the loop");
	}

}
