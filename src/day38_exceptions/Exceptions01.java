package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bolunecek tamsayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen kaca bolmek istediginizi giriniz");
		int sayi2=scan.nextInt();
		
		// java exceptions'i handle etmek icin try-catch blogu olusturmustur
		
		try {
		System.out.println("Bolme isleminin sonucu : " + sayi1/sayi2);
		
		} catch (ArithmeticException e) {
			System.out.println("Sayiyi sifira bolemezsin");
		}
		
		
	
		
		/* sayi2 = 0 girersek 
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day38_exceptions.Exceptions01.main(Exceptions01.java:16)
	
	ArithmeticException >> HATANIN TURU
	/ by zero >> HATANIN SEBEBI KAYNAGI >sayiyi 0a bolmeye calismak
	(Exceptions01.java:16) >> HATANIN YERI
		 */
scan.close();
	}

}
