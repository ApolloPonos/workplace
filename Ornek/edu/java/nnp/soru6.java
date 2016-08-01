//DIZIDEKI CIFT SAYILARI YAZDIRAN PROGRAM
package edu.java.nnp;

public class soru6 {

	public static void main(String[] args) {
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		int i,size=10;
		int c=0;
		int sum=0;
		for(i=0;i<size;i=i+1)
			if(a[i]%2==0){
				c=c+1;
				sum=sum+a[i];
						System.out.println(a[i]);
				
			}
		
			


	}
}
