//GIRILEN SAYININ DIZIDE OLUP OLMADIGINI KONTROL EDEN PROGRAM
package Kurs;

public class Kurs16 {

	public static void main(String[] args) {
		int a[] = { 3, 5, 6, 9, 3, 1, 11, 22, 37, 32, 44, 65, 72, 33, 35, 16,
				18, 19, 20, 21 };
		int i;
		int size;
		int count;
		int n;
		size = 20;
		n = 32;
		count = 0;

		for (i = 0; i < size; i++)
			if (n == a[i])
				count = 1;
		if (count == 0)
			System.out.println(n + "Yok");
		else
			System.out.println(n + "Var");

	}

}
