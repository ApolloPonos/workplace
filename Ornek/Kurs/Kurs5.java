package Kurs;

public class Kurs5 {
	
	public static void main(String[] args) {
		int ma[][] = { { 5, 7, 3 }, { 15, 6, 10 }, { 22, 9, 1 }, { 11, 14, 18 } };

		int mb[][] = new int[2][4];

		int i, j;

		for(i=0;i<4;i++)
			for(j=0;j<3;j++)
				mb[j][i]=ma[i][j];
		for(i=0;i<3;i++)
			for(j=0;j<4;j++)
				System.out.println(mb[i][j]+" ");
		System.out.println();
	}
}
