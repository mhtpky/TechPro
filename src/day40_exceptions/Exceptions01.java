package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanicidan yasini girmesini isteyin. 
		// Kodunuzu kullanici sifirdan kucuk bir sayi girerse 
		// Exception verecek sekilde yazin.

		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		if(yas>0) {
			System.out.println("Girdiginiz yas : "+ yas);
		}else {
			throw new IllegalArgumentException();
		}
		 */
		//Java'ya bir exception throw ettirmek icin "throw" ve "new" keyword'leri kullanilir
		
		// Bu sekilde yazdigimizda Java Exception throw eder.
		// Ama kodumuz da bloke olmus olur 
		// Bloke olmasini engellemek isterseniz kodu 
		// try-catch ile surround edebiliriz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		try  {
		if(yas>=0) {
			System.out.println("Girdiginiz yas : "+ yas);
		}else {
			throw new IllegalArgumentException();
		}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("Kod bloke olmamis");
	}

}
