package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		
		/*Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 		Kullanicidan bir sifre girmesini isteyin
 		Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. 
 		Ilk harf A ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
  		Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. 
  		Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin. */

		// 1. islem kullanicidan sifreyi alip ilk harfine bak
		// buyuk harf mi yoksa kucuk harf mi 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sifrenizi yaziniz");
		
		char ilkHarf = scan.next().charAt(0); // Girilen sifrenini ilk karakterini alir
		
		if (ilkHarf>='A' && ilkHarf<'Z') { //ilk harf buyuk ise
		   if(ilkHarf=='A') {
			  System.out.println("Gecerli Sifre");
		   } else {
			  System.out.println("Gecersiz Sifre Buyuk Harf");
		   }
			
		} else if (ilkHarf>='a' && ilkHarf<='z'){ //ilk harf kucuk ise
			if(ilkHarf=='z') {
				 System.out.println("Gecerli Sifre");
			   } else {
				  System.out.println("Gecersiz Sifre Kucuk Harf");
			   }
			
		} else { //ilk harf buyuk ya da kucuk harf degilse
			System.out.println("Gecersiz Sifre Lutfen Ilk Karakteri Harf Yapiniz");
	}
 scan.close();
	}
}
