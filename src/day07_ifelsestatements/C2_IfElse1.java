package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini alin
		// Uzunluklar esit ise Kare, degilse Kare Degil yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		if ( sayi1 == sayi2) {
			System.out.println("Kare");
		}
		else {
			System.out.println("Kare degil");
		}

		scan.close();
	}
 
}
