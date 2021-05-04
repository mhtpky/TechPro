package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// Kullanicidan ucgenin kenar uzunluklarini alin 
		// 3 kenar esitse "Eskenar" yazdirin
		// Yoksa "Eskenar degil" yazdirin 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
		
		
		if (kenar1 == kenar2 && kenar1 == kenar3 ) {
			System.out.println("Eskenar ucgen");	
		} 
		else {
			System.out.println("Eskenar degil");
		}	
		scan.close();	
	}
}