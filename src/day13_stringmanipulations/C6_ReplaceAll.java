package day13_stringmanipulations;

public class C6_ReplaceAll {

	public static void main(String[] args) {
		// 
		String str = "Java ogren, mutlu ol, Java candir 12345";
		
		System.out.println(str.replace("Java", "Hava"));

		// replaceAll() method'u replace() method'una benzer ama 2 farki vardir
		// 1.replace() method'u -> char kabul eder, replaceAll() kabul etmez
		// 2. replaceAll() method'u -> regex(\\w) kullanimina izin verir
		// regex >> Regular Expressions
		/* \\s : bosluk
		   \\S : bosluk disinda ki tum karakterler
		   \\w : harfler ve rakamlar (a-z , A-Z , 0-9)
	   	   \\W : harfler ve rakamlar disinda ki tum karakterler
		   \\d : rakamlar (0-9)
		   \\D : rakamlar disinda ki tum karakterler (0-9) 
		*/
		
	
		System.out.println(str.replaceAll("\\w", "*")); //tum harf ve rakamlar yerine * yazacak
		System.out.println(str.replaceAll("\\W", "*")); //w'nin tersi
		System.out.println(str.replaceAll("\\d", ".")); // sayilari . yapar
		System.out.println(str.replaceAll("\\D", ".")); // sayi olmayanlari . yapar
		System.out.println(str.replaceAll("\\s", "&")); // bosluklari & yapar
		System.out.println(str.replaceAll("\\S", "&")); // bosluk olmayanlari & yapar
		System.out.println(str.replaceAll("\\d", ""));  //sayilari siler


	}

}
