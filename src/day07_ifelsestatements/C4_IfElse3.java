package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// Kullanicidan yasini sorun
		// 65'den buyukse "Emekli olabilirsin" yoksa "Emekli olamazsin" yazdirin

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli Olabilirsin");	
		} 
		else {
			System.out.println("Emekli Olamazsin");
		}	
		scan.close();	
	}
}
