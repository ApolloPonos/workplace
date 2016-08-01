package edu.java.puzzle;

public class String9 {

	public static void main(String[] args) {
		String ad = "Celil", soyAd;

		soyAd = "Akdemir";

		String isim1 = ad + " " + soyAd;

		String isim2 = new String("Celil Akdemir");

		System.out.println(isim1);

		System.out.println(ad.length());

		if (isim1.equals(isim2))

			System.out.println("Birinci isim = ikinci isim");

	}

}
