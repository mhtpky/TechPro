package day33_oop_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// OOP concept
		// Object Oriented Programming
		// Bir proje kapsaminda ki class'larda olusturulan variable ve methodlarin
		// baska classlarda tekrar tekrar yazilmamasi, var oldugu classdan obje uretilerek
		// bu variable ve methodlarin istendigi kadar kullanilmasidir(reusability)
		// Write Once Reuse Anywhere( Bir kere yaz heryerden kullan)
		
		// scope6 classimda ki variable ve methodlara ulasmak istiyorum
		// bunun icin scope6 classindan object uretmeliyiz
		
		Scope6 obj1 = new Scope6 ();
		// Esitligin sol tarafi declaration
		// declaration 2 parcadir > Data turu + ismi
		// non-primitiveler icin Data turu ayni zamanda class ismi olabilir
		// esitligin saginda ise deger > 2 parcadan olusur 
		// new keyword'u + constructor
		// hangi class'dan obje uretmek istiyorsak o classin constructorunu kullaniriz
		obj1.num1=10;
		System.out.println(obj1.num1); // 10
		obj1.add(); //method call > Do addition
		
		// deneme() methodunu  main method icinden cagirabiir miyim ?
		// deneme() methodu static olmadigi icin main methoddan direkt cagirilamaz
		// Bunun yerine icinde oldugumuz classdan bir obje uretip onun uzerinden 
		// static olmayan methodlari da cagirabiliriz
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme();
		
	}

	public void deneme() {
		// Projemizde bulunan tum Class'lardan 
		// public variable ve methodlara istedigim yerden obje ureterek ulasabilirim
		// Eger ulasmak istedigim Class uyeleri (class member) -variable ve methodlar-
		// Public degilse baska package'lerden ulasmak icin extra islem yapmamiz gerekir
		// 
		Scope1 obj2 = new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.method();
		
		// Ben istedigim class'dan obje uretip orada ki public class uyelerine ulasabilirim 
	}
}
