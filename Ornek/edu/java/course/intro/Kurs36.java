//10 DAN KUCUK 6 TANE SAYI URETEN PROGRAM

package edu.java.course.intro;

import java.util.Random;

public class Kurs36 {

	public static void main(String[] args) {
		int a[] = { 0, 0, 0, 0, 0, 0 };
		int size;
		int n;
		int i;
		int count;
		int flag;

		count = 0;
		size = 6;

		while (count != size) {
			Random r = new Random();
			n = r.nextInt(10);
			flag = 0;
			for (i = 0; i < count; i++)
				if (n == a[i])
					flag = 1;
			if (flag == 0) {
				a[count] = n;
				count = count + 1;
			}
			for (i = 0; i < size; i++)
				System.out.println(a[i]);
		}
	}

}
