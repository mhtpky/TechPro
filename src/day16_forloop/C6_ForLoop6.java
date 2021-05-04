package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question
		// Kullanicidan bir String isteyin ve
		// Stringi tersine ceviren bir program yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir string deger giriniz");
		String yazi = scan.nextLine();

		// 1. YOL
		// Vriable olusturup en son yazdiralim
		String tersYazi = "";

		for (int i = yazi.length() - 1; i >= 0; i--) {
			tersYazi += yazi.charAt(i); // tersYazi = tersYazi+yazi.charAt(i)
		}
		
		System.out.println("Girdiginiz yazinin tersi :" + tersYazi);

		// 2. YOL
		// tersYazi'yi sadece yazdiracaksak variable olusturmadan da yapabiliriz

		System.out.print("Girdiginiz yazinin tersi : ");
		for (int i = yazi.length() - 1; i >= 0; i--) {
			System.out.print(yazi.charAt(i));
		}
		System.out.println();

		// 3. YOL
		// method olusturup yapabiliriz

		tersineCevir(yazi);
		
		scan.close();
	}

	public static void tersineCevir(String yazi) {
		System.out.print("Girdiginiz yazinin tersi : ");
		for (int i = yazi.length() - 1; i >= 0; i--) {
			System.out.print(yazi.charAt(i));
		}

	}

}
