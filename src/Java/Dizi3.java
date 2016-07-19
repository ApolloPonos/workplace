package Java;

public class Dizi3 {

	public static void main(String[] args) {

		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		int i;
		for (i = 0; i < 5; i = i + 1)
			a[i] = (i + 1) * 2;
		for (i = 0; i < 5; i = i + 1)
			System.out.println(a[i]);

	}
}
