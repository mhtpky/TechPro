package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan pozitif bir tam bir sayi alin ve 
		// bu sayiyi tam bolen sayilari ve 
		// toplam kac tane  olduklarini ekranda yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bolenleri bulmak icin pozitif bir tam sayi giriniz");
		int sayi = scan.nextInt(); // orn 100
		int bolen = 1;
		int count = 0;
		
		
		while(bolen<=sayi) {
			if (sayi%bolen==0) {
				count++; // Boleni bulunca count'u bir artiriyorum
				System.out.println( bolen);
			}
			bolen++;
		}
		System.out.println(sayi + " sayisinin bolenleri : "+ count + " adettir");

		
		// bolenleri su sekilde yazdirin
		// 1- 1
		// 2- 2
		// 3- 4
		// 4- 5
		// 5- 10
		
		bolen = 1;
		count = 0;
		
		while(bolen<=sayi) {
			if (sayi%bolen==0) {
				count++; // Boleni bulunca count'u bir artiriyorum
				System.out.println(count+ "- "+ bolen);
			}
			bolen++;
		}
		scan.close();
	}

}
