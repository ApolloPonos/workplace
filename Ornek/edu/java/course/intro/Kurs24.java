//IKI DIZI ELEMANLARININ BIRBIRINE ESIT OLUP OLMADIGINI KONTROL EDEN PROGRAM

package edu.java.course.intro;

public class Kurs24 {

	public static void main(String[] args) {
	
		int a[] = { 4, 8, 3, 1, 18, 5, 21, 20, 5, 17 };
		int b[] = { 4, 8, 3, 1, 18, 5, 21, 20, 5, 17 };

		int i;
		int count;
		int size;

		size = 10;
		count = 0;

		for (i = 0; i < size; i++)
			if (a[i] == b[i])
				count = count + 1;
		if (count == size)
			System.out.println("IKI DIZI BIRBIRINE ESIT");
		else
			System.out.println("IKI DIZI BIRBIRINE ESIT DEGIL");

	}

}
