package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		//Kullanicidan gun ismini isteyin
		//Girilen gunun  hafta ici veya hafta sonu oldugunu yazdirin 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi yaziniz");
		
		String day = scan.next().toLowerCase();
		
		//eger String'lerde esitlik sorguluyorsak == kullanmamaliyiz
		// Stringlerde esit olma durumunu sorgulamak icin equal() methodu kullanilir
		if ( day.equals("cumartesi") || day.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		if ( day.equals("pazartesi") || day.equals("sali") ||
				day.equals("carsamba") || day.equals("persembe") || day.equals("cuma")) {
			System.out.println("Haftaici");
			}
		//Bu kodda gun ismi yanlis yazilmissa olusacak bir durum yoktur
		
		scan.close();

	}

}
