package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {

	public static void main(String[] args) {
		// Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		// islemi bitirmek icin 0’a basmasini soyleyin.
		// Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve 
		// “Negatif sayi giremezsiniz” yazdirip basa donun
		// Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, 
		// yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

		Scanner scan = new Scanner (System.in);
		
		int countPoz = 0;
		int countNeg = 0;
		int toplamPoz = 0 ;
		int sayi = 1;
		
		System.out.println("Oyuna hosgeldiniz. Bitirmek istediginizde 0'a basiniz");
		
		do {
			
			System.out.println("Lutfen pozitif bir sayi giriniz ");
			sayi = scan.nextInt();
			
			if(sayi>0) {
				countPoz++;
				toplamPoz+=sayi;
			}
			if (sayi<0) {
				countNeg++;
				System.out.println("Negatif sayi giremezsiniz");
			}
		}
		while(sayi!=0);
			System.out.println("Toplam "+ countPoz + " pozitif sayi girdiniz");
			System.out.println("Toplam " + countNeg + " negatif sayi girdiniz");
			System.out.println("Girdiginiz pozitif sayilarin toplami : " + toplamPoz);
			
			scan.close();
		
	}

}
