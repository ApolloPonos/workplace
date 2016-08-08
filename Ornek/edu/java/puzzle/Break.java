package edu.java.puzzle;

public class Break {

	public static void main(String[] args) {
		int i;
		i = 0;
		while (true) {
			if (i == 6) {
				System.out.println("i degeri 6 ya esit oldu ve dongu sona erdi");
				break;

			} else
				System.out.println("i degeri:" + i);
			i++;
		}
	}

}
