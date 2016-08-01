package edu.java.course.intro;

public class Kurs6 {

	public static void main(String[] args) {

		int ma[][] = { { 5, 7, 3 }, { 15, 6, 10 }, { 22, 9, 1 }, { 11, 14, 18 } };

		int mb[][] = new int[3][4];
		int i;
		int k;
		int cowA;
		int cowB;
		int colA;
		int colB;
		cowA = 5;
		colA = 3;
		cowB = 3;
		colB = 4;

		for (i = 0; i < cowA; i++)
			for (k = 0; k < colA; k++)
				mb[k][i] = ma[i][k];
		for (i = 0; i < cowB; i++)
			for (k = 0; k < colB; k++)
				System.out.println(mb[i][k] + " ");

	}

}
