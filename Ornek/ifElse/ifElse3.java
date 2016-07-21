package ifElse;
import java.io.IOException;
import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) throws IOException {

        Scanner giris=new Scanner(System.in);

        
        int istanbulPlakaKodu=34;
        int girilenPlakaKodu;

      
        System.out.println("Istanbul'un plaka kodu nedir?");

       
        girilenPlakaKodu=giris.nextInt();

        if(girilenPlakaKodu==istanbulPlakaKodu) {
            System.out.println("Evet! Dogru yanit.");
        } else {
            System.out.println("Hayir, Istanbul'un plaka kodu 34'tur.");
        

    }
    }
}

