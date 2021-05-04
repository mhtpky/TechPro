package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// Kullanicidan 40 den kucuk pozitif bir sayi alin
		// Girilen sayinin faktoriyelini hesaplayip yazdiran bir method olusturun
		// 6! = 6*5*4*3*2*1 = 720
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen faktoriyel hesaplamak icin 35'dan kucuk pozitif bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		if (sayi >= 40 || sayi<=0) {
			System.out.println("Lutfen gecerli bir tam sayi girdiginizden emin olunuz");
		} else {
		faktoriyelBul(sayi); //
		}
		scan.close();
	}

	public static void faktoriyelBul(int sayi) {

		long faktoriyel = 1;
		for(int i = 1 ; i<=sayi ; i++) {
			faktoriyel*=i;
		}
		System.out.println(faktoriyel);
	}

}
