package edu.java.nnp;

public class soru22 {

	public static void main(String[] args) {

		int i;
		int j;
		int k;

		String[][] dizi = new String[8][8];
		int sayim = dizi.length * dizi[0].length;

		int sira = 0;
		String enson = "X";
		for (i = 0; i < dizi.length; i++) {
			System.out.println("");

			for (j = 0; j < dizi[0].length; j++) {

				sira++;
				
				if (enson == "X") {
					dizi[i][j] = "O";
					enson = "O";
				} else {
					dizi[i][j] = "X";
					enson = "X";
				}

				System.out.print("|");
				System.out.print(dizi[i][j]);

			}
			System.out.print("|");
		}

	}

}
