
package edu.java.puzzle;

import java.util.Scanner;

public class worksheet2 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int t, a, b = 12;
		double f;
		a = b * 23;
		System.out.println(a);
		t = 0;
		t = t + a;
		double c, d, e;
		e = 2.3;
		System.out.println(e);
		c = e + a;
		System.out.println(c);
		f = e + b;
		System.out.println(f);
		int k;
		k = 30;
		System.out.println(k);
		double j;
		j = 3.4;
		double m;
		m = 2.3 + j;
		System.out.println(m);
		double z = 3;
		System.out.println(z);
		int u = 4;
		double p;
		p = z / u;
		System.out.println(p);
		boolean bilgi;
		bilgi = false;
		System.out.println(bilgi);
		char q = 'q';
		char h = 'h';
		char g = 'g';
		System.out.println(q);
		System.out.println(h);
		System.out.println(g);
		int n = 5;
		int r = n - 1;
		System.out.println(n);
		System.out.println(r);
		int h1;
		h1 = n--;
		System.out.println(h1);
		int h2 = --n;
		System.out.println(h2);

		Scanner read = new Scanner(System.in);
		System.out.println("What is your name");
		String name = read.next();
		System.out.println("hello" + name);
		System.out.println("What is your age");
		int age = read.nextInt();
		System.out.println(name + " is " + age + "years old");

		Scanner read1 = new Scanner(System.in);
		System.out.printf("Hangi ulke");
		String ulke = read.next();
		System.out.printf("bu" + ulke);
		System.out.printf("kac sehir var");
		float sehir = read.nextFloat();
		System.out.printf(ulke + " de " + sehir + "var");

	}

}
