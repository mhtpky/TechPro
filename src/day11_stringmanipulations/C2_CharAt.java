package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		// charAt(index) : icine yazilan karakteri String den aliyor
		// scan.next().charAt(0) >> scan.next kismi ilk kelimeyi, charAt kismi da 0. indexdeki aliyordu
		// Index 0'dan baslar
		
		String str = "Java cok guzel";
		System.out.println(str.charAt(0)); // J
		System.out.println(str.charAt(5)); // c

		System.out.println(str.charAt(13));// l
		// Kelimenin uzunlugu son index + 1 dir >> length -> 14
		// Son index kelimenin uzunlugu(length) -1 >> son index 13
		
		// Kullanici 10 karakter bir kelime girerse >> abcd efghi
		// Bana son harfi verecek kodu yaziniz
		// System.out.println(str.charAt(9));
		
		//Eger index olarak String'in uzunlugu veya daha fazla bir sayi girilirse
		//System.out.println(str.charAt(14)); // Exception verir > hata
							// Bazi hatalar syntax'den  anlasilmaz
							// Ancak kod calistirildiktan sonra Java islemi yaparken anlasilir
							// Kod Run edildiginde ortaya ciktigi icin bu tur hatalara
							// Run Time Error > RTE

		//String str3 = 5; // Compile Time Error > CTE > Derleme Zaman Hatasi
						   // Kod calismadan Java'nin farkina varip altini kirmizi cizdigi hatalardir
						   // Bu tur hatalar duzeltilmeden Java kodu calistirmaz
		
		
	}

}
