//CIKTI ALAMADIM

package edu.java.nnp;

public class soru21 {

	public static void main(String[] args) {

	}

	void dizi() {
		String[][] dizi = new String[3][3];

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				dizi[i][j] = "X";
			}
		}
		printArray(dizi);

	}

	void printArray(String[][] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				System.out.print(" | " + dizi[i][j]);
			}
			System.out.println(" | ");
		}
	}

}
