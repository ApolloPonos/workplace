package edu.java.puzzle;

import java.util.Scanner;

public class SwitchYapisi {

	public static void main(String[] args) {
int i;
		Scanner s=new Scanner(System.in);
for (i=0;i<3;i++)
{
	System.out.println("ADINIZI GIRIN");
	String ad=s.next();
	switch (ad){
	case  "TED";
	case "TED";
	System.out.println("ADINIZ TED");
	break;
	case "FLU";
	case "FLU";
	System.out.println("ADINIZ FLU");
	break;
	default:
		System.out.println("ADINIZ HIC BIRISI DEGIL");
	}
}
	}
}