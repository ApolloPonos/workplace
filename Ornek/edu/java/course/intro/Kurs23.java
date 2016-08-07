//B DIZISINDEKI ELEMANLARIN HEPSININ A DIZISINDE OLUP OLMADIGINI KONTROL EDEN PROGRAM

package edu.java.course.intro;

public class Kurs23 {

	public static void main(String[] args) {

		int a[] = { 4, 8, 3, 1, 18, 5, 21, 20, 5, 17 };
		int b[] = { 9, 5, 1, 8 };
		
		int k;
		int i;
		int sizeA;
		int sizeB;
		int count;

		sizeA = 10;
		sizeB = 4;
		count = 0;

		for (i = 0; i < sizeB; i++)
			for (k = 0; k < sizeA; k++)
				if (b[i] == a[k])
					count = count + 1;
		System.out.println("B DIZISININ TAMAMI A DIZISINDE ");
		if (count == sizeB)
			System.out.println("VAR");
		else
			System.out.println("YOK");
	}
}
