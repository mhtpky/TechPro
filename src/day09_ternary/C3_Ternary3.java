package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		// Soru1) Kullanicidan iki sayi alin ve buyuk olani yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen karsilastirmak icin iki sayi giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		double sayi3 = (sayi1>sayi2 ? sayi1 : sayi2);
		System.out.println(sayi3);

		scan.close();
	}

}
