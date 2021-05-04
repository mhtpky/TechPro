package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi isteyin ve sayinin
		//tek veya cift sayi oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz :");
		
		int sayi = scan.nextInt();
		
		// 153 % 2 == 0 sayi cift
		// 153 % 2 == 1 sayi tek
		
		if (sayi %2==0) {
			System.out.println("Girdiginiz sayi cift sayidir");
		}
		if (sayi %2==1 || sayi%2==-1) {
			System.out.println("Girdiginiz sayi tek sayidir");
		}
	
		System.out.println("Katildiginiz icin tesekkur ederiz");
		
		scan.close();
	}
 
}
