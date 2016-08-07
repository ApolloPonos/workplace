//DIZININ ORTALAMASINA EN YAKIN DIZI ELEMANINI BULAN PROGRAM

package edu.java.course.intro;

public class Kurs21 {

	public static void main(String[] args) {
		int a[] = { 4, 8, 3, 1, 18, 5, 21, 20, 5, 17 };
		int i;
		int avg;
		int size;
		int mindif;
		int tempdif;
		int n;
		int sum;

		tempdif = 0;
		size = 10;

		sum = 0;
		for (i = 0; i < size; i++)
			sum = sum + a[i];
		avg = sum / size;
		mindif = avg - a[0];
		if (mindif < 0)
			mindif = mindif * -1;
		for (i = 1; i < size; i++)
			tempdif = avg - a[i];
		if (tempdif < 0)
			tempdif = tempdif * -1;
		if (tempdif < mindif) {
			mindif = tempdif;
			n = a[i];
			System.out.println(n);
		}
		
	}
}
