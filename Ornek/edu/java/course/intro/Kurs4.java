package edu.java.course.intro;

public class Kurs4 {

	public static void main(String[] args) {
		int m[][] = new int[5][5];

		int i, k, col, cow, count;

		cow = 5;

		col = 5;

		count = 0;

		for (i = 0; i < cow; i++)

			for (k = 0; k <= i; k++) {

				count = count + 1;

				m[i][k] = count;

				for (i = 0; i < cow; i++)

					for (k = 0; k < col; k++)

						System.out.println(m[i][k] + "");
			}
	}
}