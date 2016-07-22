//DIZI ELEMANLARINI TERSTEN YAZDIRAN PROGRAM

package soruCevap;

public class soru16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String kahvalti[] = { "Kasar", "Yumurta", "Domates", "Salatalik" };

		for (int i = 0; i < kahvalti.length / 2; i++) {
			String temp = kahvalti[i];
			kahvalti[i] = kahvalti[kahvalti.length - i - 1];
			kahvalti[kahvalti.length - i - 1] = temp;
		}

		for (String k : kahvalti)
			System.out.print(k + "\t");

	}

}
