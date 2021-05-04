package day13_stringmanipulations;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		//

		String str = " Java'yla hayat ne guzel";
		System.out.println(str.endsWith("zel")); // true

		System.out.println(str.endsWith("ne guzel")); // true

		System.out.println(str.endsWith("zel ")); // false

		// Kullanicidan bir email isteyin
		// Eger @ isareti icermiyorsa " Girdiginiz bilgi email degil"
		// Eger @ isareti iceriyor ama @gmail.com icermiyorsa " Lutfen gmail adresi
		// yazin"
		// Eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "Gecersiz gmail
		// adresi" yazdirin\

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen mail adresinizi giriniz");
		String email = scan.next();

		if (!email.contains("@")) { // basinda ! olunce -> email @ icermiyorsa
			System.out.println("Girdiginiz bilgi email degil");
		} else if (!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresi yazin");
		} else if (!email.endsWith("@gmail.com")) { // @gmail.com sonda degilse
			System.out.println("Gecersiz gmail adresi");
		} else {
			System.out.println("Email'iniz basari ile kaydedildi");
		}

		scan.close();
	}

}
