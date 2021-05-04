package day05_wrapper_concetanation_operators;

public class C1_ModulusSon {

	public static void main(String[] args) {
		
		// verilen bir integer'in birler basamaginda ki rakami yazdirin
		int sayi = 1469;
		System.out.println(sayi%10); 
		
		// verilen sayinin birler basamagi haric geriye kalan basamaklari yazdirin
		System.out.println(sayi/10); // 146
		System.out.println(sayi); //1469
		
		System.out.println(sayi/=10); //146
		System.out.println(sayi); //146
		
		
		// sayi/=10 ile sayi/10 arasinda fark nedir?
		// = isareti atama isaretidir.
		// bir islemde = isareti varsa orada deger kalici olarak degisir
		// = isareti yoksa sadece o anlik matematiksel islem yapar
		// sayi/10 yazilirsa sayinin degeri degismez
		// sayi/=10 yazilirsa sayi 10a bolunr ve yeni deger olarak sayiya atanir
		
		
	}

}
