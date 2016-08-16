package edu.java.course.intro;

import java.util.Random;

public class Kurs37 {

	public static void main(String[] args) {
		int a[] = { 0, 0, 0 };

		int n;
		int i;
		int k;
		int count = 0;
		int flag;
		int size;

		double win;
		double total;
		double natio;

		size = 3;
		win = 0;
		total = 1000000;

		for (k = 1; k < total; k++)
			count = 0;
		while (count != size) {

			Random r = new Random();
			n = r.nextInt(90) + 1;
			flag = 0;
			for (i = 0; i < count; i++){
				if (n == a[i])
					flag = 1;
			if (flag == 0) {
				a[count] = n;
				count = count + 1;
			}
			}

		
		if (a[0] + a[1] + a[2] <= 101)
			win = win + 1;
		natio = win / total;
		System.out.println(natio);
	}

}
}
