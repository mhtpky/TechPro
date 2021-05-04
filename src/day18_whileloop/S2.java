package day18_whileloop;

public class S2 {

	public static void main(String[] args) {
		// 10'dan 30'a kadar olan sayilardan 4 ile bolunebilenleri
		// Aralarinda bir bosluk olacak sekilde yanyana yazdirin

		for(int i=10; i<=30;i++) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		int sayi=10;
		
		while(sayi<=30) {
			if(sayi%4==0) {
				System.out.print(sayi+" ");
			} sayi++;
		}
	}

}
