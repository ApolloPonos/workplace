package edu.java.course.intro;

import java.util.Scanner;

public class Kurs9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı Giriniz:");
		System.out.println("Klavyeden Girilen Sayı: " + scan.nextInt());
		System.out.println("Metin Giriniz:");
		System.out.println("Klavyeden Girilen Metin: " + scan.next());
		System.out.println("Ondalıklı Sayı Giriniz:");
		System.out.println("Klavyeden Girilen Ondalıklı Sayı: "
				+ scan.nextDouble());

	}

}
