package edu.java.Headfirstjava;

import java.io.FileNotFoundException;

public class Chapter1 {

	public static void main(String[] args) {
		int size = 27;
		String name = "Fido";
	Dog myDog = new Dog(name, size);
	int	x = size - 5;
		if( x<15) myDog.bark(8);
		
		while (x>3) {
			myDog.play();
		}
int[] numList = {2,4,6,8};
System.out.println("Hello");
System.out.println("Dog:" +name);
String num = "8";
int z = Integer.parseInt(num);

try{
	readTheFile("myFile.txt");
}
		catch(FileNotFoundException ex){
			System.out.println("file not found.");
		}
	

}

	private static void readTheFile(String string) {
		
		
	}
}