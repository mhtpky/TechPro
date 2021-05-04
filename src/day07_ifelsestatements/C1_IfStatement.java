package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// Kullanicidan bir tam sayi isteyin 
		// Sayi pozitif ise "Sayi Pozitif" yazdirin
		// Sayi 100'den kucuk ise " Kucuk Sayi" yazdirin
		// Sayi 1000'den buyuk ise " Buyuk Sayi" yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		if ( sayi > 0) {
			System.out.println("Sayi Pozitif");
		}
		if ( sayi < 100 ) {
			System.out.println("Kucuk Sayi");
		}
		if (sayi > 1000 ) {
			System.out.println("Buyuk Sayi");
		}
		scan.close();	
	}

}
