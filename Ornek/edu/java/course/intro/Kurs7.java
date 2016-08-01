package edu.java.course.intro;

public class Kurs7 {

	public static void main(String[] args) {
		int ma[][] = { { 5, 7, 3 }, { 15, 6, 10 }, { 22, 9, 1 }, { 11, 14, 18 } };
		int k,i,cow,col,temp;
		cow=5;
		col=5;
		for(i=0;i<cow;i++)
			for(k=0;k<i;k++){
				temp=ma[i][k];
		ma[i][k]=ma[k][i];
		ma[k][i]=temp;
		for(i=0;i<cow;i++)
			for(k=0;k<col;k++)
				System.out.println(ma[i][k]+"n");

		

	}

}
}