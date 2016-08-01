//DIZILERIN ELEMANLARINI 1 KERE YAZDIRAN PROGRAM A DIZINDE 4 YAZILDIYSA B DIZISINDE KI 4 YAZILMAYACAK

package Kurs;

public class Kurs17 {

	public static void main(String[] args) {
		int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
		int b[] = { 8, 13, 6, 12, 4, 5, 19, 1, 14, 25 };
		int size;
		int i;
		int k;
		int flag = 0;
		size = 10;

		for (i = 0; i < size; i++)
			System.out.println(a[i] + " ");
		for (i = 0; i < size; i++)
			flag = 0;
		for (k = 0; k < size; k++)
			if (b[i] == a[k]) {
				flag = 1;
				{
					if (flag == 0)

						System.out.println(b[i] + " ");

				}

			}
	}
}