package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevrip yazdirin
		// 50'den kucukse "D", 50-60 arasi ise "C", 60-80 arasi ise "B", 80 nin uzerinde ise "A"
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen notunuzu sayi olarak giriniz");
		double not = scan.nextDouble();
		
		if (not < 0 || not > 100 ) {
			System.out.println("Lutfen gecerli bir not giriniz");	
		
		} else if (not<50){ // eger bu satir calismaya basliyorsa girilen notumuz 0 ile 100 arasinda
			System.out.println("Notunuz : D");
			
		} else if (not<60){ //bu satira geldiyse notum demekki 50 den buyuk o yuzden not>50 yazmaya gerek yoktur 50 ile 100 arasinda
			System.out.println("Notunuz : C");
			
		} else if (not<80) { //notumz 60 ile 100 arasinda
			System.out.println("Notunuz : B");
		} else { //80 ile 100 arasinda
			System.out.println("Notunuz : A");
	}
		scan.close();	
	}
}
