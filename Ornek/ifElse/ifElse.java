package ifElse;
public class ifElse {

	public static void main(String[] args) {
		int hiz = 110;
		if (hiz > 90) {
			System.out.println("Radara girdiniz");
			if (hiz >= 90 && hiz < 120)
				System.out.println("Cezaniz 200 TL");
			else if (hiz >= 120)
				System.out.println("Cezaniz 400 TL");
			else
				System.out.println("Hiziniz normal");
		}
	}
}