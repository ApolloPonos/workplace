//GIRILEN 3 DEGERIN UC KENAR UCGEN OLUSTURUP OLUSTURMADIGINI KONTROL EDEN PROGRAM

package edu.java.course.intro;

public class Kurs25 {

	public static void main(String[] args) {

	int a;
	int b;
	int c;
	
	a=5;
	b=5;
	c=5;
	
	    if(a+b>c)
		   if(a+c>b)
			   if(b+c>a)
			   System.out.println("UCGENDIR");
			
			  else
				System.out.println("UCGEN DEGILDIR");
			else
				System.out.println("UCGEN DEGILDIR");
		else
			System.out.println("UCGEN DEGILDIR");
			
	}
}
