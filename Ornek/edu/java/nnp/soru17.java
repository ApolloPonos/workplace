package edu.java.nnp;

public class soru17 {

	public static void main(String[] args) {
		int i;
		int j;

		String[][] tablo = new String[3][3];
		for (i = 0; i < tablo.length; i++) {
			for (j = 0; j < tablo.length; j++)
				tablo[i][j] = "X";
		
			System.out.println(tablo);
		}

	}

}
