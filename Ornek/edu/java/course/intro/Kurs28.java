//GIRILEN 3 FARKLI SAYININ EN BUYUGUNU BULAN PROGRAM

package edu.java.course.intro;

public class Kurs28 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = 17;
		b = 7;
		c = 9;

		if (a > b)
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		else if (c > b)
			System.out.println(b);
	}

}
