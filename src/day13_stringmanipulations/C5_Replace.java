package day13_stringmanipulations;

import java.util.Scanner;

public class C5_Replace {

	public static void main(String[] args) {
		// replace -> verilen String'de ki istenen karakter(leri) istenen yeni
		// karakter(ler) ile degistirir.
		// replace methodu char icin de kullanilablir

		// Kullanicidan bir cumle isteyin
		// Cumlede ki tum bosluklari silin ve
		// Tum a'laerin yerine e yazirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");

		String cumle = scan.nextLine();

		cumle = cumle.replace(" ", "");
		cumle = cumle.replace("a", "e");

		System.out.println(cumle);// Atama yapmazsak, manipulation str'i degistirmez
		// Eger atama yaparsak str kalici olarak degistigi icin biz bir daha orijinal
		// str'a ulasamayiz
		// Bunun icin kullanicidan aldigimiz str'a degil yeni bir String'e atamak daha
		// mantiklidir

		System.out.println("Lutfen bir cumle daha giriniz");
		String str2 = scan.nextLine();

		System.out.println(str2.replace(" ", "").replace('a', 'e'));

		// Hem a hem de e nin yerine i yazalim
		System.out.println(str2.replace("a", "i").replace('e', 'i'));

		// Hem a hem de e nin yerine i yazdiralim buyuk kucuk harf gozetmeksizin
		System.out.println(str2.toLowerCase().replace('a', 'e').replace('e', 'i'));
	
		scan.close();

	}
}