package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		// Kullanicidan bir rakam isteyin
		// Girilen rakami yazi ile yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int rakam = scan.nextInt();

		/*if (rakam == 0) {
			System.out.println("Sifir");	
		} else if (rakam == 1) {
			System.out.println("Bir");
		} else if (rakam == 2) {
			System.out.println("iki");
		} else if (rakam == 3) {
			System.out.println("Üc");
		} else if (rakam == 4) {
			System.out.println("dort");
		} else if (rakam == 5) {
			System.out.println("bes");
		} else if (rakam == 6) {
			System.out.println("alti");
		} else if (rakam == 7) {
			System.out.println("yedi");
		} else if (rakam == 8) {
			System.out.println("sekiz");
		} else if (rakam == 9) {
			System.out.println("dokuz");
		} else {
			System.out.println("Lütfen gecerli bir rakam giriniz ");
		}*/
		
		
		// Switch ile yapalim
		//== != < > || && kullanilamaz cunku boolean ifadeyi kabul etmez
		// Switch >>long boolean double float kabul etmez
		switch(rakam) {
			case 0 : 
				System.out.println("Sifir");
				break;
			case 1 : //rakam==1 demektir
				System.out.println("Bir");
				break;
			case 2 : 
				System.out.println("Iki");
				break;
			case 3 : 
				System.out.println("Uc");
				break;
			case 4 :
				System.out.println("Dort");
			case 5 : 
				System.out.println("Bes");
				break;
			case 6 : 
				System.out.println("Alti");
				break;
			case 7 : 
				System.out.println("Yedi");
				break;
			case 8 : 
				System.out.println("Sekiz");
				break;
			case 9 : 
				System.out.println("Dokuz");
				break;
			default  : // else gibi geriye kalan hersey icin gecerlidir
				System.out.println("Lutfen gecerli rakam giriniz");
		}
		
		
	scan.close();
	}
}
