//SAYI TAHMINI OYUNU

package edu.java.puzzle;

import java.util.Random;
import java.io.*;

public class Oyun2 {

	static void yakinlik(int ss, int sa) {

		int fark = sa - ss;

		if (fark <= 0 && fark > -10 || fark >= 0 && fark < 10) {
			System.out.println("Cok yakinsiniz");
		} else if (fark <= -10 && fark > -20 || fark >= 10 && fark < 20) {
			System.out.println("Yakin sayilirsiniz");
		} else if (fark <= -30 && fark > -40 || fark >= 20 && fark < 30) {
			System.out.println("Gayret edin olacak");
		} else if (fark <= -30 && fark > -40 || fark >= 30 && fark < 40) {
			System.out.println("Uzaklastiniz");
		} else if (fark <= -40 && fark > -50 || fark >= 40 && fark < 50) {
			System.out.println("Uctunuz");
		} else if (fark <= -60 && fark > -99 || fark >= 60 && fark <= 99) {
			System.out
					.println("Ohannesburgerking whopper. Atmosfer disina ciktiniz");
		}
	}

	public static void main(String[] arg) throws IOException {

		Random r = new Random();
		int sayim = r.nextInt(100);
		int hak = 12;
		int tahmin = 0;

		System.out.println("Sayi tahmin oyununa hosgeldiniz. Bir sayi tuttum. "
				+ hak + " hakkiniz var. Basladik;n" + sayim);

		BufferedReader B = new BufferedReader(new InputStreamReader(System.in));

		for (int i = hak; i > 0; i--) {

			String giris = B.readLine();

			tahmin = Integer.valueOf(giris);

			if (sayim == tahmin) {

				System.out.println("Dogru tahmin. Sayimiz " + sayim + " idi");
				System.exit(0);
			} else {

				System.out.println("Tutmadi. Ama uzulmeyin " + (i - 1)
						+ " hakkiniz kaldi");
				yakinlik(tahmin, sayim);

			}

		}

	}

}
