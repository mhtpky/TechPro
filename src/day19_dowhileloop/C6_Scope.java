package day19_dowhileloop;

public class C6_Scope {

	public static void main(String[] args) {
		// Bir class icerisinde olsturulan variable'larin nerede gecerli oldugu,
		// Ve nereden kullanilabildigini o variable'in Scope'u belirler.
		// Google > Java'da Scope nedir? >> Gecerlilik alani Kapsam demektir. 
		// Variable'in nerelerde gecerli oldugunu bize soyler
		
		int sayi = 10;
		
		denemeMethod();
		sayi++;
		System.out.println(sayi);
	}

	public static void denemeMethod() {
		// sayi=20;
		String isim="Mehtap";
	}

}
