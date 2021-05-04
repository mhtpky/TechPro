package day09_ternary;

import java.util.Scanner;

public class C5_NestedTurnary1 {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin uzunlugunu ve genisligini alin
		// Girilen degerlere gore dikdortgenin kare olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kontrol icin dikdortgenin kenar uzunluklarini giriniz");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		//String sonuc= (kenar1==kenar2 ? "kare" : "kare degil");
		//System.out.println(sonuc);
		
		String sonuc= kenar1>0 && kenar2>0 ? 
				      (kenar1==kenar2 ? "kare" : "kare degil") : 
				      "gecersiz kenar uzunlugu";
		System.out.println(sonuc);
		
		scan.close();
	}

}
