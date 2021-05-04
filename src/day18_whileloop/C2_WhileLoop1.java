package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// While : -iken, oldugu surece demektir
		// 10'dan 30'a kadar olan sayilardan 4 ile bolunebilenleri
		// Aralarinda bir bosluk olacak sekilde yanyana yazdirin
		
	
		for(int i = 10 ; i <=30 ; i++) {
			if(i%4==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		// Aynisini while ile yapalim
		
		int sayi = 10 ; // 1. sart olan baslangic degeri tanimladik while loop'dan once
		
		while (sayi<=30) { // 2. sart olan bitis kosulu while loop icine yazilir
			
			if (sayi%4==0) {
			System.out.print(sayi + " ");
			}
			sayi++; // 3. sart olan degisim degerini yazdim while loop icinde sonuna
		}
	}


}