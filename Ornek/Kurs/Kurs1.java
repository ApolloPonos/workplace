package Kurs;

public class Kurs1 {

	public static void main(String[] args) {
		int m[][] = new int[5][5];
		int i, j;

		for (i = 0; i < 5; i = i + 1)
			for (j = 0; j < 5; j = j + 1)
				if (i == j)
					m[i][j] = 1;
				else
					m[i][j] = 0;
		for (i = 0; i < 5; i = i + 1)
			for (j = 0; j < 5; j = j + 1)
				System.out.println(m[i][j] + " ");

	}

}
