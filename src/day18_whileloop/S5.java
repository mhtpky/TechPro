package day18_whileloop;

import java.util.Scanner;

public class S5 {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan pozitif bir tam bir sayi alin ve 
		// bu sayiyi tam bolen sayilari ve 
		// toplam kac tane  olduklarini ekranda yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi = scan.nextInt();
	
		int bolen =1;
		int count =0;
		
		while(bolen<=sayi) {
			if(sayi%bolen==0) {
				count++;
				System.out.println(count + " - " + bolen + " ");
			}bolen++;
			
		}System.out.println();
		System.out.println(sayi + " sayisinin " + count + " boleni vardir");
	}

}
