package Java;

public class Dizi2 {

	public static void main(String[] args) {

		int avg, size, sum, i;
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		size = 10;
		sum = 0;

		for (i = 0; i < size; i = i + 1)
			sum = sum + a[i];
		avg = sum / size;
		System.out.println("Dizinin toplami " + sum + "" + "" + "ortalamasi"
				+ avg);
	}
}