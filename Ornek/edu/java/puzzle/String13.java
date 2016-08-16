package edu.java.puzzle;

public class String13 {

	public static void main(String[] args) {

		String dizge = "Bu  arama yapabilmek icin test cumlesidir";

		System.out.print("'a' karakteri icin ilk indis : ");
		System.out.println(dizge.indexOf("a"));
		System.out.print("'a' karakteri icin son indis :");
		System.out.println(dizge.lastIndexOf("a"));
		System.out.print("'Arama' kelimesi icin ilk indis : ");
		System.out.println(dizge.indexOf("Arama"));
		System.out.print("'Deneme' kelimesi icin son indis : ");
		System.out.println(dizge.lastIndexOf("Deneme"));

	}

}
