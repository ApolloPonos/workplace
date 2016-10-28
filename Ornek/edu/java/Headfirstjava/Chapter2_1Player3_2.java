package edu.java.Headfirstjava;

public class Chapter2_1Player3_2 {

	int number = 0;
	
	public void guess(){
		number = (int) (Math.random()*10);
		System.out.println("I'm guessing"+number);
		
	}

}
