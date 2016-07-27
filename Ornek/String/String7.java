package String;

import java.util.Scanner;

public class String7 {


		public static int atla(String kelime){
			Scanner iha=new Scanner(System.in);
			String ilkCumle,sonCumle;
			
			System.out.print("Enter a string: ");
			
			ilkCumle=iha.nextLine();
			ilkCumle=ilkCumle.toUpperCase();  
			sonCumle=ilkCumle.replaceAll(" ", "");
			System.out.println("Number of occurrences of the letters in the string:");
			cumleSirasinaGore(sonCumle);
		}}
