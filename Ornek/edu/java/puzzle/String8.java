package edu.java.puzzle;

public class String8 {

	public static void main(String[] args) {
		 
		        String st1[]={"ankara","antalya","burdur","bursa","anadolu"};
		        int i;

		        for (i=0; i<st1.length; i++) {
		            if(st1[i].startsWith("an")) {    
		                System.out.println();
		                System.out.println(st1[i]+" stringi an  harfleri ile basliyor");
		            }
		        }
		        System.out.println();

		        for (i=0; i<st1.length; i++) {
		            if(st1[i].endsWith("a")) {
		                System.out.println();
		                System.out.println(st1[i]+" stringi a  harfi ile bitiyor");
		            }
		        }
		        System.out.println();

		        for (i=0; i<st1.length; i++) {
		            if(st1[i].startsWith("ka",2))
		            {
		                System.out.println();
		                System.out.println(st1[i]+" stringi 2. indisten itibaren ka harfleri ile basliyor");
		            }
		        }
		    }
		

	}
