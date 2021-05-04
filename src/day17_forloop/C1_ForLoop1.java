package day17_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		if(sayi<=0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		}else {
			rakamlarToplamiYazdir(sayi);
		}
		scan.close();
		
	}

	// Bu sekilde yapilan method'la yazdirmis oluuruz.
	// Sorunun cevabi C2 classinda
	public static void rakamlarToplamiYazdir(int sayi) {
		
		int rakamlarToplami = 0 ;
		String sayi2=sayi+"";
		
		for(int i = 1 ; i <= sayi2.length() ; i ++) {
			rakamlarToplami +=sayi%10;
			sayi/=10;
		}
		System.out.println("rakamlar toplami : " + rakamlarToplami);
	}

}
