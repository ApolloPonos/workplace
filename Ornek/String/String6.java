package String;

public class String6 {

	public static void main(String[] args) {
		String isim1 = "Cemil";
		String isim2 = "CELIL";
		String isim3 = "Celil";
		String isim4 = "CEMIL";

		System.out.println(isim1 + " ve " + isim3 + " Karsilastirma : ");
		System.out.println(isim1.compareTo(isim3));
		System.out.println(isim4 + " ve " + isim1 + "Karsilastirma :");
		System.out.println(isim4.compareTo(isim1));
		System.out.println(isim1 + " ve " + isim2 + "Karsilastirma :");
		System.out.println(isim1.compareTo(isim2));
		System.out.println(isim1 + " ve " + isim2 + " Karsilastirma :");
		System.out.println(isim1.compareTo(isim2));

	}
}
