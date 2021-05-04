package day04_matematikselislemler_modulus;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// Kullanicidan 4 basamakli bir sayi alalim ve
		// sayinin basamaklarini ters sirada yazdiralim 
		
		//Bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz
		// 1.ISLEM= en sonda ki basamagi elde etmek
		// 2.ISLEM= en sonda ki basamagi yok etmek
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Basamaklarini bulmak icin 4 basamakli bir sayi giriniz =");

		int sayi = scan.nextInt(); // Bu satirdan itibaren elimizde 4 basamakli bir sayi var.
		
		//4 basamagi elde etmek icin yukarida yazdigimiz islemi 3 kere yapiyoruz.
		//1.TEKRAR 
		int birlerBas = sayi %10;
		sayi /= 10;
		
		//bu satirdan itibaren sayimiz 3 basamakli oldu.
		
		//2.TEKRAR =>onlar basmagini bulmak icin 
		int onlarBas = sayi %10;
		sayi /=10;
		
		//bu satirdan itibaren sayimiz 2 basmakli oldu 
		
		//3.TEKRAR =>yuzler basamagi bulmak icin
		int yuzlerBas= sayi%10;
		sayi /=10;
		
		//bu satirdan itibaren sayimiz 1 basamakli, isleme gerek kalmadi.
		int binlerBas = sayi;
		
		//tum basamaklari elde ettik yazdiralim
		System.out.println("Birler basamagi: "+ birlerBas);
		System.out.println("Onlar basmagi: "+ onlarBas);
		System.out.println("Yuzler basmagi: "+ yuzlerBas);
		System.out.println("Binler basmagi: "+ binlerBas);
		
		//sayiyi tersten yazalim 1.YONTEM
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);
		System.out.println(binlerBas);
		
		
		//2.YONTEM =>Bas tarafta String bir ifade olunca toplam degil yanyana yazdirir.
		System.out.println("Yazdiginiz sayinin tersten yazilisi: " +birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		//sayinin rakamlari toplamini bulalim
		System.out.print(birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		
		scan.close();
	}

}
