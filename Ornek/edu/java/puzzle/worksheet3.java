package edu.java.puzzle;

public class worksheet3 {

	public static void main(String[] args) {

		int x = 14;
		int y = 2;
		System.out.println(y < x);
		System.out.println(x <= y);
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x <= y);
		System.out.println(x >= y);
		System.out.println(x > y);
		boolean flag = x == y;
		System.out.println(flag);
		int flag2 = x - y;
		System.out.println(flag2);
		boolean flag3 = x != y;
		System.out.println(flag3);

		int extra = 20;
		if (extra < 10) {
			System.out.println("Small");
		} else if (extra == 11)
			System.out.println("Medium");
		else
			System.out.println("Large");
		int start = 5;
		while (start <= 15) {
			if (start % 2 == 0) {

				System.out.println(start);
			}

			start++;
		}
			int sumOdd = 0;
			for (int i = 10; i <= 25; i++) {
				if (i % 2 == 1) {
					sumOdd = sumOdd + i;

				}
			}
			System.out.println(sumOdd);
		}

	}

