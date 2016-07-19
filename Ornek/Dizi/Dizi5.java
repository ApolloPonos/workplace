package Dizi;

public class Dizi5 {

	public static void main(String[] args) {
		int i,sum,avg;
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		sum=0;
		for(i=0;i<10;i=i+1)
			sum=sum+a[i];
		System.out.println("Dizinin toplami:"+sum);
		avg=sum/10;
		System.out.println("Ortalamasi"+avg);
	}

}
