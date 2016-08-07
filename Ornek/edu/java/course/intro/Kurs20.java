//DIZININ EN BUYUK NEGATIF ELEMANINI BULAN PROGRAM

package edu.java.course.intro;

public class Kurs20 {

	public static void main(String[] args) {
		int a[] = { 4, 8, -3, -1, 18, 5, -21, 20, 5, -17 };
		int i;
		int size;
		int maxTemp;

		size = 10;
		i = 0;

		while (a[i] >= 0)
			i++;
		maxTemp = a[i];
		for (i = i + 1; i < size; i++)
			if (a[i] < 0)
				if (a[i] > maxTemp)
					maxTemp = a[i];
		System.out.println(maxTemp);
	}

}
