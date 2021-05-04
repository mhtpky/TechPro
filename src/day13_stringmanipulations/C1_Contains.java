package day13_stringmanipulations;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve aramak istedigi bir String isteyin
		// Cumle String'i iceriyorsa "basarili", icermiyorsa" basarisiz" yazdirin
		
		String str1 = "abcd";
		String str2 = "efg";
		
		System.out.println(str1.contains(str2));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle yaziniz");
		String cumle= scan.nextLine().toLowerCase();
		System.out.println("Lutfen aramak istediginiz String'i yaziniz");
		String aranan= scan.nextLine().toLowerCase();
		
		// Bu islemin sonucu booleandir. Benim bunu yaziya cevirmem lazim
		
		System.out.println(cumle.contains(aranan) ? "Basarili" : "Basarisiz");
		
		// Kullanicidan mail adresini isteyin
		// Mail adresi @gmail.com iceriyorsa " mailiniz kaydedildi" , icermiyorsa " lutfen gmail adresinizi giriniz" yazdirin
		
		System.out.println("Lutfen mail adresinizi giriniz");
		String mail = scan.next();  //email adresi 2 kelime olmayacagindan next() ile ilk kelimeyi alarak yanlis girilmeleri de kontrol altina alabiliriz.
	
		// Eger gmail.com 'un en sonda oldugunu kontrol etmek istersek
		
		int sondami = mail.indexOf("@gmail.com", mail.length()-10);  //index olarak length()-10 yazarsam
		
		
		// Eger mail gmail.com ile bitiyorsa bu islemin sonucu bir index olur(int)
		// Eger mail gmail.com ile bitmiyorsa -1 verir
		
		if(mail.contains("@gmail.com") && sondami != -1) {
			System.out.println("Mailiniz Kaydedildi");
		}else {
			System.out.println("Lutfen gmail adresinizi giriniz");
		}
		
		scan.close();
	}
}
