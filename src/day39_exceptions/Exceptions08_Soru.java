package day39_exceptions;

import java.util.Scanner;

public class Exceptions08_Soru {

	public static void main(String[] args) {
		/*
        Kullanicidan carpma yapmak icin bir String isteyin. 
        Kullanicinin girdigi String sadece sayilardan olusuyorsa 
        sayiyi 2 ile carpip sonucu yazdirin.
       Kullanici sayilardan olusmayan bir String girerse 
       “Girdiginiz String sayiya cevrilemez” yazdirin.
        */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen carpma islemi icin bir String giriniz");
		String str = scan.next();
		
		try {
		System.out.println(2*Integer.parseInt(str));
		} catch(NumberFormatException e) {
			System.out.println("Girdiginiz String sayiya cevrilemez");
		}
	}

}
