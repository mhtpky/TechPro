package day20_scope;

import java.util.Scanner;

public class Scope1 {

	int sayi; // class'in icinde fakat main method'un disinda olusturulan ve 
			  // static olmayan variable'lara INSTANCE (Object) variable denir.
			  // class level'da olusturuldugu icin class'in her yerinden belli sartlarla kullanilabilir
			  // Instance variable'lar object'e bagli olarak caisir(ogretmen adi ogrenci adi gibi)
	
	public String isim="Mehtap";
	public String soyisim;   // default deger null
	boolean izindeMi; // default deger false
	char ilkHarf;   // default deger bosluk
	
	
	public static void main(String[] args) {
		
		//System.out.println(sayi); // static olmayan bir variable'a static method icinden ulasamayz
								// main method'umuz static oldugu icin main method icerisinden
		//method();				// static olmayan variable veya method'lara direkt ulasamayiz 
		
		// instance bir variable'a main method icerisinden ulasmak istedigimizde 
		// OBJECT olusturmaliyiz
		
		Scanner       scan    =       new                     Scanner(System.in); // bu java'da ki standart obje olusturma seklidir
	// class ismi 	 obje ismi    obje olusturmada keyword    class ismi()
		
		Scope1 obj1 = new Scope1();
		System.out.println(obj1.sayi); // Buna deger atamadik Java default deger atadi >0
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim);// Buna da deger atamadik java default deger atadi > null 
		// Instance variable'lar olusturuldugunda biz istersek deger atayabiliriz
		// Instance variable'lara eger biz deger atamazsak Java Default deger atar
		
		
		Scope1 obj2 = new Scope1();
		obj2.isim = "Muslum";
		obj2.soyisim = "Baba";
		System.out.println(obj2.isim+ " " + obj2.soyisim); // Muslum Baba
		System.out.println(obj1.isim+ " " + obj1.soyisim); // Mehtap null
		
		System.out.println(obj2.izindeMi); // default deger > false
		System.out.println(obj2.ilkHarf); // default deger bosluk
		
		Scope1 obj3 = new Scope1();
		obj3.isim = "Ferdi";
		obj3.soyisim = "Tayfur";
		obj3.izindeMi = true;
		System.out.println(obj3.isim + " " + obj3.soyisim + " "+ obj3.izindeMi);
	
	scan.close();
	}

	public static void staticMethod() { //STATIC METHOD
		
	}
	
	public void method() { //STATIC OLMAYAN METHOD
		System.out.println(sayi); // bu method static olmadigi icin instance variable'lara dogrudan erisebilirim
		sayi=sayi+20; // bu method icerisinde gecerli olmak uzere degerini degistirebilir
		System.out.println(sayi);
	}
}
