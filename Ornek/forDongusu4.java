import java.util.Scanner;

public class forDongusu4 {

		public static void main(String[] args) {
			Scanner girdi = new Scanner(System.in);
		 
			int sayi=0, bulunan=0, bulunmayan=0;
		 
			for(int i=0;i<5;i++){
		 
				System.out.print("Pozitif bir sayı giriniz: ");
				sayi = girdi.nextInt();
		 
				if(sayi<=30){
		 
					double X = 1;
		 
					for(int sayac=1; sayac<=sayi; sayac++){
		 
						X = X * sayac;
					}
		 
					System.out.println("Girilen " + sayi + " sayısının faktöriyeli: " + X);
		 
					bulunan++;
		 
				}else{
		 
					bulunmayan++;
				}
		 
			}
		 
			System.out.println("Faktöriyeli bulunan sayı adedi: " + bulunan);	
			System.out.println("Faktöriyeli bulunmayan sayı adedi: " + bulunmayan);
		 
			}
		 
		}

