package day09_ternary;

public class C1_Ternary1 {

	public static void main(String[] args) {
		
		int sayi = 15;
		
		//Ternary islemi, bir sonuc dondurdugunden bir variable olusturup ona assign etmeliyiz.
		
		String sonuc = sayi%2==0 ? "Cift Sayi" : "Tek Sayi";
		
		System.out.println(sonuc);
		
		//Bir variable'a assign etmek istemezsem
		//syso icine yazabilirim
		System.out.println(sayi%2==0 ? "Cift Sayi" : "Tek Sayi");
		
		//Basin aciklama yazmak istersem
		//Turnary islemini parantez icine almaliyiz
		System.out.println("Islem sonucu : "+(sayi%2==0 ? "Cift Sayi" : "Tek Sayi"));
		
	}
}
