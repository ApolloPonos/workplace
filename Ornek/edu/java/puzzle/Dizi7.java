package edu.java.puzzle;

public class Dizi7 {

	public static void main(String[] args) {
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		int n, size = 10;
		n = 6;
		int i;
		
		for(i = 0;i<n;i=i+1)
			a[size-n+i]=a[i];
					for(i=0;i<size-n;i=i+1)
						a[i]=0;
					for(i=0;i<size;i=i+1)
						System.out.println(a[i]);
	}
}
