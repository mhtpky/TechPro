package day15_methodcreation;


public class C4_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdiralim
		
		/*System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");*/

		// Bunun yerine loop kullaniyoruz
		// Ne yapacagimizi Java'ya soyluyoruz, kac kere yapmasi gerektigini de soyluyoruz
		
		// Tum looplarda 3 seyi yazmak zorundayiz
		// 1) Baslangic degeri
		// 2) Bitis degeri
		// 3) Artis degeri
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(i + " Hello World");
		}
		
		// NOT : Eger sart kismi bizim artisimiza gore  hep true verirse loop sonsuz donguye girer
		// NOT : loop'da artis degeri pozitif oldugu gibi negatif de olabilir i--
		// NOT : Artis degeri 1 olmak zorunda degil farkli da olabilir i+=5
		// NOT : Eger loop'un sarti hic true olmazsa loop body hic devreye girmez => for(int i=100 ; i>300; i-=5) {
	}

}
