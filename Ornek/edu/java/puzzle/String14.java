//STRING KARAKTERLERI BUYUK YA DA KUCUK YAPAN PROGRAM

package edu.java.puzzle;

public class String14 {

	public static void main(String[] args) {

		String dizge = "Bu OrNek HarF KiPi DEgisImi MetoTlari IcIn YApilDi";
		String kucuk = "";
		String buyuk = "";

		System.out.println("String nesnesinin orjinal hali: ");
		System.out.println(dizge);
		buyuk = dizge.toUpperCase();
		System.out.println("Buyuk harf kipi ile String nesnesi: ");
		System.out.println(buyuk);
		kucuk = dizge.toLowerCase();
		System.out.println("Kucuk harf kipi ile String nesnesi: ");
		System.out.println(kucuk);
	}

}
