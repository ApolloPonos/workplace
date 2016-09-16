package edu.deniz.homework;

public class homeWork4 {

	public static int sesliharfsayisi(String kelime) {
		String sesliharfler = "aeiou";
		int adet = 0;
		for (int i = 0; i < kelime.length(); i++) {
			for (int j = 0; j < sesliharfler.length(); j++) {
				if (kelime.charAt(i) == sesliharfler.charAt(j))
					adet++;
			}
		}

		return adet;
	}

	public static void main(String[] args) {
		System.out.printf("Icerisinde ki sesli harf sayisi:");
		System.out.println(sesliharfsayisi("Zaman cabuk geciyor dunya yavas donuyor."));
		System.out.printf("Icerisinde bulunan karakter adedi:");
		System.out.println("Zaman cabuk geciyor dunya yavas donuyor".length());
	}
}