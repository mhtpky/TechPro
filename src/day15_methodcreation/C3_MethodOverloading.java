package day15_methodcreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		// Java da birden fazla method olusturulursa buna OVER LOADING denir
		// Overloading yapabilmek icin Method Signature 'larinin farkli olmasi gerekir.
		// Method Signature = isim+ parametre sayisi + parametre data turu
		// Birbirini kapsayan data turleri oldugunda Java en optimum olan secenege gore islem yapar.
		// Birebir uyan method varsa onu calistirir, yoksa en fazla uyani calistirir
		// Ornegin char methodu olusturmamis olsak ve cagirdigimiz islem char karakter olsa 
		// integer methodu ile islemini tamamlar/
		// Eger kapsayan bir method bulamazsa String de oldugu gibi Java CTE verir
		
		toplama(2 , 5 );
		toplama(60.2 , 50.5);
		toplama(60.2 , 50); //double method sonucu
		toplama ('a' , 'b'); // char method sonucu 195 > char methodu yazmams olursak integer method sonucu 195 seklinde yazdirir
		toplama("ali" , "veli");// String method sonucu
		
	}

	
	public static void toplama(int sayi1 , int sayi2) {
		System.out.println("integer method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(double sayi1 , double sayi2) {
		System.out.println("double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(int sayi1 , double sayi2) {
		System.out.println("integer ve double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(double sayi1 , int sayi2) {
		System.out.println("integer ve double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(char char1 , char char2) {
		System.out.println("char method sonucu : " + (char1+char2));
	}
	
	public static void toplama(String str1 , String str2) {
		System.out.println("String method sonucu : " + (str1+str2));
	}
	
	
}
