//CIKTI ALAMIYORUM?

package edu.java.nnp;

public class soru20 {

	public static void main(String[] args) {

		int i;
		int j;

		String[][] dizi = new String[3][3];
		int sayim = dizi.length * dizi[0].length;

		for (i = 0; i < dizi.length; i++) {
			System.out.println("");

			for (j = 0; j < dizi[0].length; j++) {

				dizi[i][j] = "X";
				System.out.print("|");
				System.out.print(dizi[i][j]);

			}
			System.out.print("|");
		}

	}

}
