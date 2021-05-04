package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin,
		//Sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin
		//Sayilarin ikisi de negatif ise sayilarin carpimini yazdirin
		//Sayilarin ikisi farkli isaretlere sahip ise "farkli isaretler de sayilarla islem yapamazsin"yazdirin
		//Sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemnadir"yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen iki sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1==0||sayi2==0) {
			System.out.println("sifir carpmaya gore yutan elemandir");
		}else if(sayi1>0 && sayi2>0) {
			System.out.println("sayilarin toplami:"+ (sayi1+sayi2));
		}else if(sayi1<0 && sayi2<0) {
			System.out.println("sayilarin carpimi:"+ sayi1*sayi2);
		}else {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
		}
	scan.close();
	}

}
