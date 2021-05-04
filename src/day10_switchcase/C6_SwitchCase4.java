package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// Kullanicidan VIP (Very Import Person) kisaltmasinda hangi harfin anlamini
		// istedigini soralim
		// Girilen harfin aciklamasini yazdiralim

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen VIP kelimesinde hangi harfin anlamini isteginizi giriniz");

		// char harf = scan.next().toUpperCase().charAt(0);

		char harf = scan.next().charAt(0);

		switch (harf) {
		case 'v':
		case 'V':
			System.out.println("Very");
			break;
		case 'a':
		case 'A':
			System.out.println("Import");
			break;
		case 'p':
		case 'P':
			System.out.println("Person");
			break;
		default:
			System.out.println("Gecersiz harf");
		}
			// Kullanicinin birden fazla harf girmesini sorun olarak kabul ediyorsaniz
			// Ve bunu hata olarak kullaniciya bildirmek istiyorsaniz

			System.out.println("Lutfen VIP kelimesinde hangi harfin anlamini isteginizi giriniz");

			String str = scan.next();

			switch (str) {
			case "v":
			case "V":
				System.out.println("Very");
				break;
			case "a":
			case "A":
				System.out.println("Import");
				break;
			case "p":
			case "P":
				System.out.println("Person");
				break;
			default:
				System.out.println("Gecersiz harf");

			
		}
		scan.close();
	}
}
