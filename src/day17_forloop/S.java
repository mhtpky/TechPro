package day17_forloop;

import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		/*
		 * Kullanicidan pozitif bir rakam girmesini isteyin ve 
		 * girilen rakama gore asagida ki sekli cizdirin
		
			*
		    * *
		    * * * 
		    * * * *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
		}
		scan.close();
	}

}
