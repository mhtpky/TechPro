package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		// Sayi 3 basamakli ise "Uc Basamakli Sayi"
		// Degilse "Uc Basamakli Degil" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		String sonuc = sayi >=100 ? (sayi<1000 ? "Uc Basamakli Sayi" : "Uc Basamakli Degil") :  "Uc Basamakli Degil";
		System.out.println(sonuc);
		
		//nested turnary olmasin dersek
		
		String sonuc2 = sayi >= 100 && sayi<100  || sayi<=-100 && sayi>-1000 ? "Uc Basamakli Sayi" : "Uc Basamakli Degil";
		System.out.println(sonuc2);
		
		scan.close();
	}

}
