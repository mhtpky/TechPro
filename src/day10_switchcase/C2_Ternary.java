package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		//Sayi cift ise "cift" yazdirin
		//Degilse sayinin karesini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		//Eger ternary de iki durum icin farkli data tipleri donusu oluyorsa
		// ya variable'a atama yapmadan direkt yazdiririz
		// ya da mumkunse sonuclari ayni data tipine cevirmeye calisiriz
		//String sonuc = (sayi%2 == 0 ? "Cift" : sayi*sayi+"");
		//System.out.println(sonuc);
	
		System.out.println(sayi%2 == 0 ? "Cift" : sayi*sayi);

		scan.close();
	}

}
