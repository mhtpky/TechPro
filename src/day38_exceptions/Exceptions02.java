package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

		// Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin
		// Bu islemi araliksiz 100 kereye kadar yapalim

		int count = 1;
		Scanner scan = new Scanner(System.in);

		while (count <= 100) {

			System.out.println("Lutfen bolunecek tamsayiyi giriniz");
			int sayi1 = scan.nextInt();
			System.out.println("Lutfen kaca bolmek istediginizi giriniz");
			int sayi2 = scan.nextInt();

			/*
			 java'ya exceptions'i handle etmek icin bir cozum uretmezsek 
			 Java exception ile karsilastiginda calismayi durdurur.(STOP EXECUTION) 
			 THROWS EXCEPTION(exception firlatir).Problemin kaynagini bize gosterir.
			 
			 Tum application durmus olur.. 
			 Musterinin kullandigi bir uygulama icin bu KABUL EDILEMEZ. 
			 Bunun icin kod yazan kisi muhtemel sorunlari ongormeli ve 
			 Java'ya bu sorunla handle edebilmesi icin yol gostermelidir
			 */

			System.out.println("islem no : " + count);
			try {
				System.out.println("Bolme isleminin sonucu : " + sayi1 / sayi2);
			} catch (ArithmeticException e) {
				System.out.println("Sayiyi sifira bolemezsin");
			}
			count++;
		}
scan.close();
	}

}
