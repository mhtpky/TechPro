package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		// Verilen iki syiyi toplayan ve sonucu yazdiran bir method yaziniz
		
		int sayi1 = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		
		toplam(sayi1,sayi2);
		
		// Verilen uc syiyi toplayan ve sonucu yazdiran bir method yaziniz
		toplam(sayi1,sayi2,sayi3);
		
		// Oyle bir method yazalim ki icine kac sayi yazarsak yazalim toplasin
		toplam(2,3); // iki sayinin toplami methodu
		toplam(2,5,8); // uc sayinin toplami methodu calisr
		// istedigimiz kadar sayiyi yazabilecegimiz methodu olusturabilmemiz icin 
		// Java varargs olusturmustur.
	}

	public static void toplam(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin toplami : " + (sayi1+sayi2+sayi3));	
	}

	public static void toplam(int sayi1, int sayi2) {	
		System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));
	}

}
