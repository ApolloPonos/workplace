package edu.java.course.intro;

public class Kurs2 {

	public static void main(String[] args) {
		int m[][] = new int[5][5];
		int i, j, cow, col;
		j = 0;
		cow = 5;
		col = 5;
		for (i = 0; i < cow; i++)
			m[i][j] = 1;
		m[i][4 - i] = 1;
		for (i = 0; i < cow; i++)
			for (j = 0; j < col; j++)
				System.out.println(m[i][j]);
	}

}
