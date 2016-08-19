package edu.java.nnp;

public class soru23 {

	public static void main(String[] args) {

		String[] dizi = new String[10];

		dizi[0] = "Sifir";
		dizi[1] = "Bir";
		dizi[2] = "Iki";
		dizi[3] = "Uc";
		dizi[4] = "Dort";
		dizi[5] = "Bes";
		dizi[6] = "Alti";
		dizi[7] = "Yedi";
		dizi[8] = "Sekiz";
		dizi[9] = "Dokuz";

		String test = "01729387";

		String[] parcalar = test.split("");
		int i;
		for (i = 0; i < parcalar.length; i++) {
			System.out.println("ilk parcalar "
					+ dizi[Integer.parseInt(parcalar[i])]);

		}

	}

}
