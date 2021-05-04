package day18_whileloop;

import java.util.Scanner;

public class S4 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve 
		// baslangic harfinden baslayip bitis harfinde biten tum harfleri 
		// buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.


		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ilk harfi giriniz");
		char harf1= scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen son harfi giriniz");
		char harf2= scan.next().toUpperCase().charAt(0);
		
		for(char i=harf1; i<=harf2;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		while(harf1<=harf2) {
			System.out.print(harf1+" ");
			harf1++;
		} scan.close();
	}

}
