package edu.java.course.intro;

public class Kurs13 {

	public static void main(String[] args) {
		int a[] = { 1, 5, 12, 15, 19, 28, 35, 46, 53, 60, 0 };
		int i = 0;
		int k;
		int n = 17;
		int size = 11;
		int temp;
		
		a[size-1]=n;
		for(i=size-2;i>0;i=i-1)
		
		
		{
		
			temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			}
			for (i=0;i<size;i=i+1)

		System.out.println(a[i]+" ");
	}
}
