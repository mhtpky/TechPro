package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// Kullanicidan bir karakter girmesini isteyin
		// Harf olup olmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir karakter giriniz");
		char karakter = scan.next().charAt(0);
		
		if ((karakter >= 'a' && karakter <='z')|| (karakter >= 'A' && karakter <='Z') ) {
			// || dan sonraki kismi yazmak yerine lowercase eklemek de ayni islevi gordurur => char karakter = scan.next().toLowerCase().charAt(0); 
			System.out.println("girdiginiz karakter harf");	
		} 
		else {
			System.out.println("girdiginiz karakter harf degil");
		}
		scan.close();
	}

}
