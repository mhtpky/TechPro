package day12_stringmanipulation;

import java.util.Scanner;

public class C3_Length {
	public static void main(String[] args) {
		// Kullanicidan bir String girmesini isteyin
		// Girilen String'in son harfini buyuk olarak yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String str = scan.nextLine().toUpperCase();
		
		System.out.println("Girdiginiz cumlenin uzunlugu : " + str.charAt(str.length()-1));
		
		//length() methodu girilen String'in uzunlugunu verir
		System.out.println(str); // Kullanici ne girdiyse buyuk harfle yazdirir
		
		String str2 = ""; // "Ali" ==> 3
		System.out.println(str2.length());
		
		String str3 = null; // null hic demektir
							// Normalde String'ler '''icine yazilir ama null icin buna gerek yoktur
							// null case sensitividir. NULL veya Null yazilmaz
							// null bir deger degildir, sadece hicligi gosteren bir pointer'dir
		
		//System.out.println(str3.length()); // RTE verir
		
		//System.out.println(str2.equals(str3));
		System.out.println(str.charAt(1)); // indexi 1 olan (bastan ikinci) harfi verir
		System.out.println(str3.charAt(1)); //RTE
		
		scan.close();
	}
}
