package day12_stringmanipulation;

import java.util.Scanner;

public class C4_IndexOf {
	
	public static void main(String[] args) {
		//indexOf() methodu bize istedigimiz karakter(lerin) indexini dondurur
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6)); //g
		
		System.out.println("char arama " + str.indexOf('g')); //6
		
		System.out.println("String arama " + str.indexOf("g")); //6
		
		System.out.println("String kelime arama " + str.indexOf("is")); //i -> 12 s ->13// ilk harfin indexini verir
		
		System.out.println("Birden faza varsa " + str.indexOf('i')); // birden fazla ayni karakter varsa ilk buldugunun indexini getiri
		
		
		
		System.out.println("Baslangic indexi ile " + str.indexOf('a', 4)); //Baslangic indexi >inclusive

		System.out.println("Olmayan Kelime " + str.indexOf("dert")); // -1
		
		// Kullanicidan bir cumle isteyin
		// case sensitive olmadan Java kelimesi icerip icermedigini yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaziniz");
		String cumle =  scan.nextLine().toLowerCase();
		
		//int sonuc = cumle.indexOf("java");  // java varsa, ilk java kelimesinin index'ini dondurur
											// java yoksa, -1
		
		//System.out.println(sonuc==-1 ? "java icermez " : "java icerir");
		
		
		if(cumle.indexOf("java")>=0) { // java kelimesinin index'inin 0 veya daha buyuk oldugunu kontrol ediyor
			System.out.println("Cumle java iceriyor");
		} else {
			System.out.println("Cumle java icermiyor");
		}
		
		scan.close();
		
	}
}
