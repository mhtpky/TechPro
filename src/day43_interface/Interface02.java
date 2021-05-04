package day43_interface;

public interface Interface02 {
	
	// SORU  > Burada ki default ve static bizim bildigimiz default static mi
	// CEVAP > Hayir

	public default void deneme () {
		System.out.println("Default keyword'lu method calisti");
	}
	// Bizim bildigimiz default Access Modifier'di
	// Bir methodda birden fazla access modifier olur mu? Hayir
	// Bizim interface'de olusturdugumuz tum methodlar public ve abstractur demistik
	// Interface'de default keyword kullanarak concrete method olusturabiliriz
	// Burada ki default keywordu access modifier degil
	// Java'nin ozel bir cozumudur
	
	// Yani burada ki default keyword basina yazildigi methodun concrete oldugunu belirtir
	
	static void deneme2 () {
		System.out.println("Static keyword'lu method calisti");	
	}
	
	// Yukarida default keyword'u icin yazdiklarimiz static icin de gecerlidir
	
	// Static ve default keyword'u kullanarak olusturdugumz methodlar 
	// override edilmek ZORUNDA DEGILDIR. Cunku concrete'dir
}
