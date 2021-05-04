package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// Kullanicidan hangi gunde oldugunu isteyin
		// Girilen gunun haftaici ya da hafta sonu oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz");
		String gun = scan.next().toLowerCase();

		switch (gun) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("Hafta ici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("Hafta sonu");
			break;
		default :
				System.out.println("Lutfen gecerli bir gun giriniz");
	}
 scan.close();
	}
	}
