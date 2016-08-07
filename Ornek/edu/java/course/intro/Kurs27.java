//CESIT KENAR UCGEN OLUP OLMADIGINI BULAN PROGRAM

package edu.java.course.intro;

public class Kurs27 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = 5;
		b = 12;
		c = 15;

		if (a != b)
			if (b != c)
				if (a != c)
					System.out.println("CESIT KENAR");
				else
					System.out.println("CESIT KENAR DEGIL");
			else
				System.out.println("CESIT KENAR DEGIL");
		else
			System.out.println("CESIT KENAR DEGIL");

	}

}
