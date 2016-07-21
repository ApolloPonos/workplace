package soruCevap;

public class soru8 {

	public static void main(String[] args) {
		int i, a, c;
		i = 10;
		for (a = 0; a < i; a = a + 1) {
			System.out.println(a + "");
			for (c = 0; c < i; c--)
				System.out.println("");
			for (c = 0; c < a; c = c + 1) {
				System.out.println("*");
				{
					System.out.println(a);
				}

			}
		}
	}
}