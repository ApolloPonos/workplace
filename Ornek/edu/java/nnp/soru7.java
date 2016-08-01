//GIRILEN SAYIDAN KUCUK VE CIFT OLANLARINI EKRANA YAZDIRAN PROGRAM
package edu.java.nnp;

public class soru7 {

	public static void main(String[] args) {
		int i;
		int b;
		b = 15;

		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		for (i = 0; i < 10; i = i + 1)
			if (a[i] < b)
				if (a[i] % 2 != 1)
					System.out.println(a[i]);
	}
}