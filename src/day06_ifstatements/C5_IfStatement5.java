package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// Kullanicidan bir dikdortgenin iki kenar uzunlugunu alin
		// Kenar uzunluklari esitse kare
		// Esit degilse dikdortgen yazdirin
		
		Scanner scan = new Scanner ( System.in);
		System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu giriniz");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if( kenar1>0 && kenar2>0 & kenar1==kenar2) {
			System.out.println("kare");
		}
		if (kenar1>0 && kenar2>0 & kenar1!=kenar2) {
			System.out.println("dikdortgen");
		}
		if (kenar1<=0 || kenar2<=0);
		System.out.println("Lutfen gecerli uzunluk giriniz");
		
	scan.close();
	}
 
}
